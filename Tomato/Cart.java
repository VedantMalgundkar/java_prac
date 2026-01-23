package Tomato;
import java.util.List;

public class Cart {
    private Restaurant res;
    private List<Menu> items;
    
    Cart(Restaurant restau) {
        this.res = restau;
    }

    public void addItems(Menu menu) {
        this.items.add(menu);
    }

    public List<Menu> getItems() {
        return items;
    }
}