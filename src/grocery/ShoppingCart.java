package grocery;

import java.util.ArrayList;
import java.util.HashMap;

public class ShoppingCart {

    ArrayList<Groceries> itemsInCart;

    HashMap<Integer, Groceries> itemQuantity;


    public ShoppingCart() {
        itemsInCart = new ArrayList<>();

    }

    public void addItemToCart(Groceries item) {
        itemsInCart.add(item);
    }

    public void removeItemFromCart(Groceries item) {
        itemsInCart.remove(item);
    }

    public void getAllItemsInCart() {
        itemsInCart.forEach(item -> {
            System.out.println(item);

        });
    }
}
