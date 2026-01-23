package Tomato;

public class DeliveryOrder extends Order {
    private String userAddress;

    DeliveryOrder() {
        this.userAddress = ""; 
    }

    @Override
    String getType() {
        return "Delivery";
    }

    public void setUserAddress(String addr) {
        this.userAddress = addr;
    }

    public String getUserAddress() {
        return this.userAddress;
    }
}