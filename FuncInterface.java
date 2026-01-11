@FunctionalInterface
interface A {
    void add(int i, int j);
}
public class FuncInterface {
    public static void main(String[] args) {
        A obj = (i, j) -> System.out.println("test " + (i + j) );
        A obj2 = new A() {
            public void add(int i, int j) {
                System.out.println("print >>"+ (i + j));
            }
        }; 
        obj.add(4,6);
        obj2.add(5,6);
    }
}