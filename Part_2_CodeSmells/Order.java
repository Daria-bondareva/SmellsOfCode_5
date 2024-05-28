package CodeSmells_lab_5.Part_2_CodeSmells;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String customerName;
    private List<String> items;
    private double totalPrice;

    public Order(String customerName, List<String> items) {
        this.customerName = customerName;
        // Створюємо новий список на основі переданого, щоб уникнути зміни початкового списку
        this.items = new ArrayList<>(items);
        this.totalPrice = TotalPrice.calculateTotalPrice(this.items);
    }

    public void addItem(String item) {
        items.add(item);
        totalPrice += Products.getPriceByName(item);
    }

    public void removeItem(String item) {
        if (items.remove(item)) {
            totalPrice -= Products.getPriceByName(item);
        }
    }

    public void processOrder() {
        ProcessOrder.processOrder(this);
    }

    public void displayOrder() {
        System.out.println("Customer: " + customerName);
        System.out.println("List of items: " + items);
        System.out.println("Total price: " + totalPrice);
    }

    // Геттери і сеттери

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
