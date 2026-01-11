package factoryDesign;

class BasicGarlicBread implements IGarlicBread {
    @Override
    public void prepare() {
        System.out.println("preparing Basic GarlicBread >>>");
    }
}

class StandardGarlicBread implements IGarlicBread {
    @Override
    public void prepare() {
        System.out.println("preparing Standard GarlicBread >>>");
    }
}

class PremiumGarlicBread implements IGarlicBread {
    @Override
    public void prepare() {
        System.out.println("preparing Premium GarlicBread >>>");
    }
}


class BasicWheatGarlicBread implements IGarlicBread {
    @Override
    public void prepare() {
        System.out.println("preparing Basic wheat GarlicBread >>>");
    }
}

class StandardWheatGarlicBread implements IGarlicBread {
    @Override
    public void prepare() {
        System.out.println("preparing Standard wheat GarlicBread >>>");
    }
}

class PremiumWheatGarlicBread implements IGarlicBread {
    @Override
    public void prepare() {
        System.out.println("preparing Premium wheat GarlicBread >>>");
    }
}

interface IFactoryV2 {
    public IBurger createBurger(String type);
    public IGarlicBread createGarlicBread(String type);
}

class FastFoodCentreV2 implements IFactoryV2 {
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
    
    @Override
    public IGarlicBread createGarlicBread(String type) {
        switch (type) {
            case "basic":
                return new BasicGarlicBread();

            case "standard":
                return new StandardGarlicBread();
            
            case "premium":
                return new PremiumGarlicBread();

            default:
                throw new IllegalArgumentException("invalid type of garlic bread");
        }
    }
}

class HealthyFoodCentreV2 implements IFactoryV2 {
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

    @Override
    public IGarlicBread createGarlicBread(String type) {
        switch (type) {
            case "basic":
                return new BasicWheatGarlicBread();

            case "standard":
                return new StandardWheatGarlicBread();
            
            case "premium":
                return new PremiumWheatGarlicBread();

            default:
                throw new IllegalArgumentException("invalid type of wheat garlic bread");
        }
    }
}

public class AbstractFactory {
    public static void main(String[] args) {
        IFactoryV2 factory = new HealthyFoodCentreV2();
        IBurger burger = factory.createBurger("basic");
        IGarlicBread garlicBread = factory.createGarlicBread("basic");

        burger.prepare();
        garlicBread.prepare();
    }
}
