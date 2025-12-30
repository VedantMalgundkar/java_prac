// each by default extends Object Class
class A extends Object {
    public A () {
        super();
        System.out.println("ran A constructor");
    }

    public A (int a) {
        super();
        System.out.println("ran A constructor with a >> "+a);
    }
}

class B extends A {

    public B () {
        System.out.println("ran B constructor");
    }
    
    public B (int k) {
        // this(); // calls default constructor
        // super(k); // calling paramerterized super constuctor
        super();

        System.out.println("ran B constructor with k >> "+k);
    }
}

public class Test {
    public static void main(String[] args) {
        B obj = new B(8);
    }
}