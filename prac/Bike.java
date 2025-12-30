package prac;

public class Bike {
    protected String name = "suzuki";
}

class Activa extends Bike {
    public static void main(String[] args) {
        Bike b = new Bike();
        System.out.println(b.name);
    }
}

class Tvs {
    public static void main(String[] args) {
        Bike b = new Bike();
        System.out.println(b.name);
    }
}
