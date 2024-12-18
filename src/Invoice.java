public class Invoice {
    public static void generateInvoice(Orders order, Users user, DeliveryBoy deliveryBoy) {
        System.out.println("------ Invoice ------");
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Customer: " + user.getName());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Address: " + user.getAddress());
        System.out.println("Phone Number: " + user.getMobileNo());
        System.out.println("Weight: " + order.getWeight() + " kg");
        System.out.println("Distance: " + order.getDistance() + " km");
        System.out.println("Total Bill: Rs " + order.getPrice());
        System.out.println("---------------------");
        System.out.println("Delivery Boy Details:");
        System.out.println("Name: " + deliveryBoy.getName());
        System.out.println("Contact Number: " + deliveryBoy.getContactNumber());
        System.out.println("---------------------");
    }
}
