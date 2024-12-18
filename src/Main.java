import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UsersDetails usersDetails = new UsersDetails();
        DeliveryBoyDetails deliveryBoyDetails = new DeliveryBoyDetails();
        AdminDetails adminDetails = new AdminDetails();

        System.out.println("Welcome! Select an option:");
        System.out.println("1. User\n2. Admin");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.println("Enter User Details:");
            System.out.println("Enter User ID:");
            String userId = scanner.nextLine();
            System.out.println("Enter Name:");
            String name = scanner.nextLine();
            System.out.println("Enter Phone Number:");
            String mobileNo = scanner.nextLine();
            System.out.println("Enter Email:");
            String email = scanner.nextLine();
            System.out.println("Enter Password:");
            String password = scanner.nextLine();
            System.out.println("Enter Address:");
            String address = scanner.nextLine();
            usersDetails.registerUser(userId, name, mobileNo, email, password, address);

            System.out.println("User Registered");

            System.out.println("Enter Weight:");
            int weight = scanner.nextInt();
            System.out.println("Enter Distance:");
            int distance = scanner.nextInt();
            scanner.nextLine();

            deliveryBoyDetails.displayCities();
            System.out.print("Enter your choice: ");
            int cityChoice = scanner.nextInt();
            scanner.nextLine();
            String city = deliveryBoyDetails.getCityByNumber(cityChoice);

            if (city != null) {
                DeliveryBoy deliveryBoy = deliveryBoyDetails.getDeliveryBoy(city);
                Orders order = new Orders(userId, weight, distance);
                Users user = usersDetails.getUser(userId);
                Invoice.generateInvoice(order, user, deliveryBoy);
            } else {
                System.out.println("Invalid city");
            }
        } else if (choice == 2) {
            System.out.println("Enter Admin ID:");
            String adminId = scanner.nextLine();
            System.out.println("Enter Admin Password:");
            String adminPassword = scanner.nextLine();
            Admin admin = adminDetails.loginAdmin(adminId, adminPassword);

            if (admin != null) {
                System.out.println("Admin logged in successfully!");

                while (true) {
                    System.out.println("Admin Menu:");
                    System.out.println("1. Display Available Destinations");
                    System.out.println("2. Display DeliveryBoy Details");
                    System.out.println("3. Add Destination and DeliveryBoy");
                    System.out.println("4. Logout");
                    System.out.print("Enter your choice: ");
                    int adminChoice = scanner.nextInt();
                    scanner.nextLine();

                    if (adminChoice == 1) {
                        deliveryBoyDetails.displayCities();
                    } else if (adminChoice == 2) {
                        deliveryBoyDetails.displayDeliveryBoyDetails();
                    } else if (adminChoice == 3) {
                        System.out.println("Enter new City Name:");
                        String newCity = scanner.nextLine();
                        System.out.println("Enter Delivery Boy Name:");
                        String deliveryBoyName = scanner.nextLine();
                        System.out.println("Enter Contact Number:");
                        String contactNumber = scanner.nextLine();
                        deliveryBoyDetails.addDestination(newCity, deliveryBoyName, contactNumber);
                        System.out.println("Updated Destinations and Delivery Boys:");
                        deliveryBoyDetails.displayAllDetails();
                    } else if (adminChoice == 4) {
                        System.out.println("Logged out successfully");
                        break;
                    } else {
                        System.out.println("Invalid Please try again");
                    }
                }
            } else {
                System.out.println("Wrong admin details");
            }
        } else {
            System.out.println("Invalid option");
        }

        scanner.close();
    }
}
