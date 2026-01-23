package Tomato;

public class PickupOrder extends Order {
    private String restaurantAddress;

    @Override
    String getType() {
        return "Delivery";
    }

    public void setPickUpAddress(String addr) {
        this.restaurantAddress = addr;
    }

    public String getPickUpAddress() {
        return this.restaurantAddress;
    }
    
}