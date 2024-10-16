interface Pizza {
    String getDescription();
    double getCost();
}

class MargheritaPizza implements Pizza {
    public String getDescription() {
        return "Margherita Pizza";
    }

    public double getCost() {
        return 6.00;
    }
}

class VegetarianPizza implements Pizza {
    public String getDescription() {
        return "Vegetarian Pizza";
    }

    public double getCost() {
        return 7.00;
    }
}

abstract class ToppingDecorator implements Pizza {
    protected Pizza pizza;

    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription();
    }

    public double getCost() {
        return pizza.getCost();
    }
}

class CheeseTopping extends ToppingDecorator {
    public CheeseTopping(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    public double getCost() {
        return pizza.getCost() + 1.50;
    }
}

class MushroomTopping extends ToppingDecorator {
    public MushroomTopping(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Mushrooms";
    }

    public double getCost() {
        return pizza.getCost() + 2.00;
    }
}

class PizzaShop {
    public static void main(String[] args) {
        Pizza pizza = new MargheritaPizza();
        System.out.println(pizza.getDescription() + " Cost: $" + pizza.getCost());

        pizza = new CheeseTopping(pizza);
        System.out.println(pizza.getDescription() + " Cost: $" + pizza.getCost());

        pizza = new MushroomTopping(pizza);
        System.out.println(pizza.getDescription() + " Cost: $" + pizza.getCost());
    }
}
