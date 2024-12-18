public class DeliveryBoy {
    private String deliveryBoyId;
    private String name;
    private String contactNumber;

    public DeliveryBoy(String deliveryBoyId, String name, String contactNumber) {
        this.deliveryBoyId = deliveryBoyId;
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public String getDeliveryBoyId() {
        return deliveryBoyId;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setDeliveryBoyId(String deliveryBoyId) {
        this.deliveryBoyId = deliveryBoyId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }


}
