class MyUtil extends Thread {
    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}
class A implements Runnable {
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("run from A");
            MyUtil.wait(500);
        }
    }
}
class B implements Runnable {
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("run from B");
            MyUtil.wait(500);
        }
    }
}
public class ThreadingExample2 {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
        
        for (int i = 0; i < 20; i++) {
            System.out.println("from main program");
            MyUtil.wait(400);
        }
    }
}