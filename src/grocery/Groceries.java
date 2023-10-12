package grocery;

import java.util.ArrayList;

public class Groceries {

    //name of the grocery item
    public String name;

    //integer quantity of the grocery item
    public int quantity;

    //the category that the item belongs to
    public String category;

    //when a new grocery item is created, assign a value to its name, category, and quantity field
    public Groceries(String name, String category, int quantity) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
    }



}
