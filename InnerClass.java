class A {
    int age = 10;

    public void getAge() {
        System.out.println(age);
    }

    // class B {
    static class B {
        public void show() {
            System.out.println("show from class B");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        // A.B obj2 = obj.new B();
        A.B obj2 = new A.B();

        obj.getAge();
        obj2.show();

    }
}