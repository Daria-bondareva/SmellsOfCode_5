package CodeSmells_lab_5.Part_2_CodeSmells;

import java.util.List;

public class TotalPrice {
    public static double calculateTotalPrice(List<String> items) {
        double price = 0.0;
        for (String item : items) {
            price += Products.getPriceByName(item);
        }
        return price;
    }
}
