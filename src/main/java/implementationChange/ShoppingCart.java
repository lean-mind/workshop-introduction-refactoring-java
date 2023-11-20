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
        this.price = price;
    }

    public int calculateTotalPrice() {
        return price;
    }

    public boolean hasDiscount() {
        return price >= 100;
    }

    public int numberOfProducts() {
        return prices.size();
    }
}
