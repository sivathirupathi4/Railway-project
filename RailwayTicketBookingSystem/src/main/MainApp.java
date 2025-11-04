package main;

import controller.*;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StationController stationController = new StationController();
        TrainController trainController = new TrainController();
        TicketController ticketController = new TicketController();

        while (true) {
            System.out.println("\n===== RAILWAY TICKET BOOKING SYSTEM =====");
            System.out.println("1. Add Station");
            System.out.println("2. Add Train");
            System.out.println("3. List Stations");
            System.out.println("4. List Trains");
            System.out.println("5. Book Ticket");
            System.out.println("6. List Tickets");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Station Code: ");
                    String scode = sc.next();
                    System.out.print("Enter Station Name: ");
                    String sname = sc.next();
                    stationController.addStation(scode, sname);
                    break;

                case 2:
                    System.out.print("Enter Train Number: ");
                    String tnum = sc.next();
                    System.out.print("Enter Train Name: ");
                    String tname = sc.next();
                    trainController.addTrain(tnum, tname);
                    break;

                case 3:
                    stationController.listStations();
                    break;

                case 4:
                    trainController.listTrains();
                    break;

                case 5:
                    System.out.print("Enter Train ID: ");
                    int trainId = sc.nextInt();
                    System.out.print("Enter User ID: ");
                    int userId = sc.nextInt();
                    System.out.print("Enter Source Station ID: ");
                    int sourceId = sc.nextInt();
                    System.out.print("Enter Destination Station ID: ");
                    int destId = sc.nextInt();
                    ticketController.bookTicket(trainId, userId, sourceId, destId);
                    break;

                case 6:
                    ticketController.listTickets();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}