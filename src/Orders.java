public class Orders {
    private String orderId;
    private String accountId;
    private int weight;
    private int distance;
    private double price;

    public Orders(String accountId, int weight, int distance) {
        this.orderId = "ORD1";
        this.accountId = accountId;
        this.weight = weight;
        this.distance = distance;
        this.price = calculatePrice(weight, distance);
    }

    public double calculatePrice(int weight, int distance) {
        double price = distance * 8;
        if (weight <= 5) price += 50;
        else if (weight <= 10) price += 100;
        else price += 150;
        return price;
    }

    public String getOrderId() {
        return orderId;
    }

    public int getWeight() {
        return weight;
    }

    public int getDistance() {
        return distance;
    }

    public double getPrice() {
        return price;
    }


    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
}
