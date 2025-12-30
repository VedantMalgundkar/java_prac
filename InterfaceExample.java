interface A {
    void show();
    void goHome();
}
interface B extends A {
    void run();
}
class C implements B {
    public void show() {
        System.out.println("showing from InterfaceExample");
    }
    public void goHome() {
        System.out.println("Going home");
    }
    public void run() {
        System.out.println("running ");
    }
}
class InterfaceExample {
    public static void main(String[] args) {
        A obj = new C();
        obj.show();
        obj.goHome();

        C obj1 = (C) obj;
        obj1.run();
    }
}