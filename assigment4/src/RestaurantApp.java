abstract class MenuComponent {
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }
}

class MenuItem extends MenuComponent {
    String name;
    String description;
    double price;

    public MenuItem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void print() {
        System.out.println("Item: " + getName() + ", Description: " + getDescription() + ", Price: " + getPrice());
    }
}

class Menu extends MenuComponent {
    java.util.ArrayList<MenuComponent> menuComponents = new java.util.ArrayList<>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.println("\nMenu: " + getName() + ", " + getDescription());
        System.out.println("------------------------");

        java.util.Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }
}

class RestaurantApp {
    public static void main(String[] args) {
        MenuComponent lunchMenu = new Menu("Lunch Menu", "Lunch specials");
        MenuComponent dinnerMenu = new Menu("Dinner Menu", "Evening specials");
        MenuComponent mainMenu = new Menu("Main Menu", "All meals");

        lunchMenu.add(new MenuItem("Burger", "Delicious beef burger", 8.99));
        lunchMenu.add(new MenuItem("Salad", "Healthy green salad", 6.99));

        dinnerMenu.add(new MenuItem("Steak", "Grilled steak", 14.99));
        dinnerMenu.add(new MenuItem("Pasta", "Creamy Alfredo pasta", 11.99));

        mainMenu.add(lunchMenu);
        mainMenu.add(dinnerMenu);

        mainMenu.print();
    }
}
