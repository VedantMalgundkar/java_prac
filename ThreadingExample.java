class A extends Thread {
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("From A thread.");
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }
}
class B extends Thread {
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("From B thread.");
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }
}
public class ThreadingExample {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        obj1.start();
        obj2.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("from main program");
        }
    }
}