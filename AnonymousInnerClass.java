class A {
    public void show() {
        System.out.println("Show from A");
    }
}
class AnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        // overriding with anonymous Inner class
        A obj2 = new A()
        {
            public void show() {
                System.out.println("Show from Anonymous");
            }
        };
        obj2.show();
    }
}