package Tomato;

public class User {
    private static int incrId = 0;
    private int id;
    private String name;
    private String address;
    private Cart cart;  

    User(String name, String address) {
        this.name = name;
        this.address = address;
        this.id = ++incrId;
    }

    User(String name, String address, Cart cart) {
        this.id = ++incrId;
        this.name = name;
        this.address = address;
        this.cart = cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public Cart getCart() {
        return cart;
    }
}
