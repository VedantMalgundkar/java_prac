abstract class A {
    public abstract void show();
}
class AbstractAnonImplimentation {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("in annon show");
            };
        };
        obj.show();
    }
}