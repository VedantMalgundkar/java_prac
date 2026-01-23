package Tomato;

public class UpiPayment implements IPaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("paying amount by upi >> " + amount);
    }
}
