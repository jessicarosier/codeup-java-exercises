package grocery;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ShoppingCart {


    //list of all Grocery items that have been added
    ArrayList<Groceries> itemsInCart;


    //key  = category
    //value = item name
    HashMap<String, String> itemCategory;


    //when a new shopping cart is created, create a new list to hold all the items added to the cart
    public ShoppingCart() {
        itemsInCart = new ArrayList<>();
        itemCategory = new HashMap<>();
    }

    //adds a Grocery item to the cart (add to itemsInCart ArrayList)
    public void addItemToCart(Groceries item) {
        itemsInCart.add(item);
        itemCategory.put(item.category, item.name);
    }

    //removes a Grocery item to the cart (removes from itemsInCart ArrayList)
    public void removeItemFromCart(Groceries item) {
        itemsInCart.remove(item);
    }

    public void meatCategory() {
        //bucket for items that have meat as a category
        ArrayList<String> names = new ArrayList<>();


        itemsInCart.forEach(item -> {
            if (item.category.equalsIgnoreCase("meat")) {
                names.add(item.name + " - " + item.quantity);
            }

        });

        //sorts in the names alphabetically
        Collections.sort(names);
        //if the array is NOT empty, print out the list
        if (!names.isEmpty()) {
            names.forEach(item -> {
                System.out.printf("%s\n", item);
            });
        }

    }

    public void fruitCategory() {
        //bucket for items that have fruit as a category
        ArrayList<String> names = new ArrayList<>();

        itemsInCart.forEach(item -> {
            if (item.category.equalsIgnoreCase("fruit")) {
                names.add(item.name + " - " + item.quantity);
            }
        });

        Collections.sort(names);
        //if the array is NOT empty, print out the list
        if (!names.isEmpty()) {
            names.forEach(item -> {
                System.out.printf("%s\n", item);
            });
        }

    }

    public void dairyCategory() {
        //bucket for items that have dairy as a category
        ArrayList<String> names = new ArrayList<>();

        itemsInCart.forEach(item -> {
            if (item.category.equalsIgnoreCase("dairy")) {
                names.add(item.name + " - " + item.quantity);
            }
        });

        Collections.sort(names);
        //if the array is NOT empty, print out the list
        if (!names.isEmpty()) {
            names.forEach(item -> {
                System.out.printf("%s\n", item);
            });
        }

    }

    public void vegetableCategory() {
        //bucket for items that have dairy as a category
        ArrayList<String> names = new ArrayList<>();

        itemsInCart.forEach(item -> {
            if (item.category.equalsIgnoreCase("vegetable")) {
                names.add(item.name + " - " + item.quantity);
            }
        });

        Collections.sort(names);
        //if the array is NOT empty, print out the list
        if (!names.isEmpty()) {
            names.forEach(item -> {
                System.out.printf("%s\n", item);
            });
        }
    }

    public void snackCategory() {
        //bucket for items that have dairy as a category
        ArrayList<String> names = new ArrayList<>();

        itemsInCart.forEach(item -> {
            if (item.category.equalsIgnoreCase("snack")) {
                names.add(item.name + " - " + item.quantity);
            }
        });

        Collections.sort(names);
        //if the array is NOT empty, print out the list
        if (!names.isEmpty()) {
            names.forEach(item -> {
                System.out.printf("%s\n", item);
            });
        }
    }


    //prints out a list of every item in the itemsInCart ArrayList by category and alphabetically
    public void getAllItemsInCart() {

        this.dairyCategory();

        this.meatCategory();

        this.fruitCategory();

        this.vegetableCategory();

        this.snackCategory();
    }
}
