class Animal {
    public void makeNoice() {
        System.out.println("animal making noice");
    }
}

class Dog extends Animal {
    public void makeNoice() {
        System.out.println("Barking !!");
    }
    
    public void growl() {
        System.out.println("Grrrrr !!");
    } 
}

class Cat extends Animal {
    public void makeNoice() {
        System.out.println("Meow !!");
    }
    
    public void growl() {
        System.out.println("Mewoooooooooooooooooooo !!");
    } 
}

public class UpDownCast {
    public static void main(String[] args) {
        Animal obj = new Cat();
        // obj.makeNoice();
        // Dog obj1 = (Dog) obj;
        commonAnimaStuff(obj);

    }

    public static void commonAnimaStuff(Animal animal) {
        animal.makeNoice();
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.growl();
        }
    }
}