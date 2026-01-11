package factoryDesign;

class BasicBurger implements IBurger {
    public void prepare () { 
        System.out.println("preparing Basic burger >>>");
    }
}

class StandardBurger implements IBurger {
    public void prepare () { 
        System.out.println("preparing Standard burger >>>");
    }
}

class PremiumBurger implements IBurger {
    public void prepare () { 
        System.out.println("preparing premium burger >>>");
    }
}

class BurgerFactory {
    public IBurger createBurger(String type) {
        switch (type) {
            case "basic":
                return new BasicBurger();

            case "standard":
                return new StandardBurger();
            
            case "premium":
                return new PremiumBurger();

            default:
                throw new IllegalArgumentException("invalid type of burger");
        }
    }
}

public class SimpleFactory {
    public static void main(String[] args) {
        BurgerFactory factory = new BurgerFactory();
        IBurger burger = factory.createBurger("premium");
        burger.prepare();
    }
    
}
