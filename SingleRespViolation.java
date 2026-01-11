import java.util.ArrayList;
import java.util.List;

class Product {
    public String name;
    public String desc;
    public int price;

    Product(String productName, String productDescription, int productPrice) {
        this.name = productName;
        this.desc = productDescription;
        this.price = productPrice;
    }

    @Override
    public String toString() {
        return "PRODUCT : "+this.name+" | "+ this.desc +" at Rs. "+ this.price;
    }
}

class ShoppingCart {
    private List <Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public int calculateTotal() {
        int totalPrice = 0;
        for (Product eachProduct : this.products) {
            System.out.println(eachProduct);
            totalPrice += eachProduct.price;
        }
        return totalPrice;
    }

    public void printInvoice() {
        System.out.println("printing Invoices of products >> ");
        int total = this.calculateTotal();
        System.out.println("your total is : "+ total);
    }

    public void saveToDb() {
        System.out.println("saving products to db >>");
    }
}

public class SingleRespViolation {
    public static void main(String[] args) {
        Product earphone = new Product("Realme Buds 2", "wired Earphone", 500);
        Product laptop = new Product("Dell Inspirion", "Office laptop", 25000);

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(earphone);
        cart.addProduct(laptop);
        cart.printInvoice();
        cart.saveToDb();
    }
}