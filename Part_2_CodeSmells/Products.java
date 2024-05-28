package CodeSmells_lab_5.Part_2_CodeSmells;

public enum Products {
    APPLE("Apple", 1.0),
    BANANA("Banana", 0.5),
    ORANGE("Orange", 0.8),
    GRAPES("Grapes", 2.0),
    MANGO("Mango", 1.5);

    private final String name;
    private final double price;

    Products(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static double getPriceByName(String name) {
        for (Products product : Products.values()) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product.getPrice();
            }
        }
        return 0.0;
    }
}
