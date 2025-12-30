abstract class Car {
    public abstract void drive();

    public void playMusic() {
        System.out.println("playing music ...");
    }
}
class Tata extends Car {
    public void drive() {
        System.out.println("Implimented drive ...");
    } 
    public void openSunRoof() {
        System.out.println("opening sunroof");
    }
}
class AbstractExample {
    public static void main(String[] args) {
        Tata obj = new Tata();
        obj.openSunRoof();
    }
}
