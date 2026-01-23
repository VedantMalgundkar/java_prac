package Tomato;

public class PickupOrder extends Order {
    private String RestaurantAddress;

    @Override
    String getType() {
        return "Delivery";
    }

    public void setPickUpAddress(String addr) {
        this.RestaurantAddress = addr;
    }

    public String getPickUpAddress() {
        return this.RestaurantAddress;
    }
    
}