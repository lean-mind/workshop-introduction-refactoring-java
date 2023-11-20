package implementationChange;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private int price;
    private List<Integer> prices;

    public ShoppingCart() {
        prices = new ArrayList<>();
    }

    public void add(int price) {
        this.prices.add(price);
    }

    public int calculateTotalPrice() {
        return prices.stream().mapToInt(integer -> integer).sum();
    }

    public boolean hasDiscount() {
        return calculateTotalPrice() >= 100;
    }

    public int numberOfProducts() {
        return prices.size();
    }
}
