import java.util.HashMap;

public class DeliveryBoyDetails {
    private HashMap<String, DeliveryBoy> deliveryBoyMap;
    private HashMap<Integer, String> cityNumberMap;

    public DeliveryBoyDetails() {
        deliveryBoyMap = new HashMap<>();
        cityNumberMap = new HashMap<>();

        // Add default destinations and delivery boys
        addDestination("Vijayawada", "Ram", "9087656823");
        addDestination("Bhimavaram", "Raju", "9870486395");
        addDestination("Hyderabad", "Ramu", "8963120739");
        addDestination("Amaravati", "Ravi", "8056281540");
        addDestination("Vizag", "Vijay", "7836120735");
        addDestination("Guntur", "Vinay", "9087231648");
        addDestination("Ongole", "Rohan", "8765432019");
        addDestination("Kakinada", "Tagore", "9320174920");
        addDestination("Anantapur", "Pranav", "8401839265");
    }

    public void addDestination(String city, String deliveryBoyName, String contactNumber) {
        int cityNumber = cityNumberMap.size() + 1;
        cityNumberMap.put(cityNumber, city);
        deliveryBoyMap.put(city, new DeliveryBoy(String.valueOf(cityNumber), deliveryBoyName, contactNumber, "Standard"));
    }

    public void displayCities() {
        System.out.println("Available Destinations:");
        for (int cityNumber : cityNumberMap.keySet()) {
            System.out.println(cityNumber + ". " + cityNumberMap.get(cityNumber));
        }
    }

    public void displayDeliveryBoyDetails() {
        System.out.println("Delivery Boy Details:");
        for (DeliveryBoy boy : deliveryBoyMap.values()) {
            System.out.println("Name: " + boy.getName() + ", Contact: " + boy.getContactNumber());
        }
    }

    public void displayAllDetails() {
        System.out.println("City and Delivery Boy Details:");
        for (int cityNumber : cityNumberMap.keySet()) {
            String city = cityNumberMap.get(cityNumber);
            DeliveryBoy boy = deliveryBoyMap.get(city);
            System.out.println(city + " - " + boy.getName() + " - " + boy.getContactNumber());
        }
    }

    public String getCityByNumber(int cityNumber) {
        return cityNumberMap.get(cityNumber);
    }

    public DeliveryBoy getDeliveryBoy(String city) {
        return deliveryBoyMap.get(city);
    }


}
