package implementationChange;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Integer> prices;
    private List<Price> prices2;

    public ShoppingCart() {
        prices = new ArrayList<>();
        prices2 = new ArrayList<>();
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
