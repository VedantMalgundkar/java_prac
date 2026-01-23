package Tomato;

public class CardPayment implements IPaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("paying amount by Card >> " + amount);
    }
}
