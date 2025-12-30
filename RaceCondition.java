class MyAccount {
    protected static int balance = 1000;
    public synchronized static int increment(int val) { 
        balance = balance + val;
        return balance; 
    };
    public synchronized static int decrement(int val) { 
        balance = balance - val; 
        return balance;
    };
}
class DebitCard implements Runnable {
    private boolean isIncrement = false;

    DebitCard(boolean isIncrement) {
        this.isIncrement = isIncrement;
    }

    public void run() {
        int bal;
        for (int i = 0; i < 4; i++) {
            if(isIncrement) {
                int price = 1;
                bal = MyAccount.increment(1);
                System.out.println(i +" increment run >>> "+ price +" "+ bal);
            }
            else {
                int price = 2;
                bal = MyAccount.decrement(2);
                System.out.println(i +" decrement run >>> "+ price +" "+bal);
            }
        }
    }
}
public class RaceCondition extends MyAccount {
    public static void main(String[] args) {
        try {
            DebitCard card1 = new DebitCard(true);
            DebitCard card2 = new DebitCard(false);
    
            Thread t1 = new Thread(card1);
            Thread t2 = new Thread(card2);
    
            t1.start();
            t2.start();
            
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println("something went wrong");
        } finally{
            System.out.println("balance is : >>> "+MyAccount.balance);
        }
    }
}