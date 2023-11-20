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
        this.prices2.add(new Price(price));
    }

    public int calculateTotalPrice() {
        return prices2.stream().mapToInt(price -> price.getValue()).sum();
    }

    public boolean hasDiscount() {
        return calculateTotalPrice() >= 100;
    }

    public int numberOfProducts() {
        return prices2.size();
    }
}
