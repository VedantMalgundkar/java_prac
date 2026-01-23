package Tomato;
import java.util.List;

public abstract class Order {
    static int incrId = 0;
    private int id;
    private User user; 
    private Restaurant restaurant;
    private List<Menu> menuItems;
    private IPaymentStrategy payMode;

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
}