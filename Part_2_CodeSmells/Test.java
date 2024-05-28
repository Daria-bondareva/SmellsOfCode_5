package CodeSmells_lab_5.Part_2_CodeSmells;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>(Arrays.asList("Apple", "Banana"));

        Order order = new Order("John Doe", items);

        order.addItem("Grapes");
        order.addItem("Mango");

        order.removeItem("Banana");

        order.displayOrder();

        order.processOrder();

        double applePrice = Products.getPriceByName("Apple");
        System.out.println("Price of Apple: " + applePrice);

        double unknownPrice = Products.getPriceByName("Unknown");
        System.out.println("Price of Unknown: " + unknownPrice);
    }
}
