package Tomato;

public class DeliveryOrder extends Order {
    private String DeliveryAddress;

    @Override
    String getType() {
        return "Delivery";
    }

    public void setDeliveryAddress(String addr) {
        this.DeliveryAddress = addr;
    }

    public String getDeliveryAddress() {
        return this.DeliveryAddress;
    }
}