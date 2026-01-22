package Tomato;

public class Menu {
    static int incrId = 0;
    int id;
    String name; 
    double price;

    Menu(String name,double price) {
        this.id = ++incrId;
        this.name = name;
        this.price = price;
    }
    
    public double getPrice() {
        return price;
    }
}
