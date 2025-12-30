class A {
    public void show() {
        System.out.println("in show A");
    }
}

class B extends A {

}

public class Test2 {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}