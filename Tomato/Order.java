package Tomato;
import java.util.List;

public abstract class Order {
    static int incrId = 0;
    private int id;
    private User user; 
    private Restaurant restaurant;
    private List<Menu> menuItems;
    private IPaymentStrategy payMode;
    private double total;

    Order () {
        this.id = ++incrId;
    }

    abstract String getType();

    public void setUser(User user) {
        this.user = user;
    }

    public void setRestaurant(IPaymentStrategy paymentMode) {
        this.payMode = paymentMode;
    }

    public void setRestaurant(Restaurant restau) {
        this.restaurant = restau;
    }

    public void addMenuItems(Menu menu) {
        this.menuItems.add(menu);
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public double getTotal () {
        double total = 0;
        for (Menu menu : menuItems) {
            total += menu.getPrice();
        }
        return total;
    }

    public boolean processPayment() {
        if(payMode != null) {
            payMode.pay(total);
            return true;
        } else {
            System.out.println("Please choose a payment mode first");
            return false;
        }
    }
}