package Tomato;
import Tomato.Menu;
import java.util.List;

public class Restaurant {
    static int incrId = 0;
    int id;
    String name;
    String location;
    private List<Menu> menuItems;

    Restaurant (String name, String location) {
        this.id = ++incrId;
        this.name = name;
        this.location = location;
    }

    public void addMenu(String name, double price) {
        menuItems.add(new Menu(name, price));
    }

    public List<Menu> getMenuItems() {
        return menuItems;
    }

    public String getLocation() {
        return location;
    }
}
