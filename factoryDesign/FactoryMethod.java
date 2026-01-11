package factoryDesign;

class BasicWheatBurger implements IBurger {
    @Override
    public void prepare() {
        System.out.println("preparing Basic wheat burger >>>");
    }
}

class StandardWheatBurger implements IBurger {
    @Override
    public void prepare() {
        System.out.println("preparing Standard wheat burger >>>");
    }
}

class PremiumWheatBurger implements IBurger {
    @Override
    public void prepare() {
        System.out.println("preparing Premium wheat burger >>>");
    }
}

interface IFactory {
    public IBurger createBurger(String type);
}

class FastFoodCentre implements IFactory {
    @Override
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

class HealthyFoodCentre implements IFactory {
    @Override
    public IBurger createBurger(String type) {
        switch (type) {
            case "basic":
                return new BasicWheatBurger();

            case "standard":
                return new StandardWheatBurger();
            
            case "premium":
                return new PremiumWheatBurger();

            default:
                throw new IllegalArgumentException("invalid type of burger");
        }
    }
}

public class FactoryMethod {
    public static void main(String[] args) {
        IFactory factory = new FastFoodCentre();
        IBurger burger = factory.createBurger("standard");
        burger.prepare();
    }
    
}
