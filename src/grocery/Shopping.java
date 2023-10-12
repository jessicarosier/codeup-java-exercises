package grocery;
import util.Input;

public class Shopping {

    public static void main(String[] args) {

        //creates a new Input
        Input sc = new Input();
        //initializes and int bucket
        int selectedCategory;
        //initializes a String bucket for the item category
        String itemCat = new String();


        boolean wantsToShop = sc.yesNo("Would you like to create a grocery list?");

        //creates a new instance of a ShoppingCart
        ShoppingCart userCart = new ShoppingCart();


        if (wantsToShop) {
             boolean wantsToEnterItem = sc.yesNo("Would you like to enter a new item?");
            while (wantsToEnterItem) {
                System.out.println("1 - Dairy");
                System.out.println("2 - Meats");
                System.out.println("3 - Fruits");
                System.out.println("4 - Vegetables");
                System.out.println("5 - Snacks");

                //selected category will be given the value of the int the user selected
                 selectedCategory= sc.getInt("Select a category.");

                 //determines the itemCat based on the value of the selectedCategory
                 switch (selectedCategory) {
                     case 1:
                         itemCat = "dairy";
                         break;
                     case 2:
                         itemCat = "meat";
                         break;
                     case 3:
                         itemCat = "fruit";
                         break;
                     case 4:
                         itemCat = "vegetable";
                         break;
                     case 5:
                         itemCat = "snack";
                         break;
                 }

                 //stores the user inputted item name
                String itemName = sc.getString("Enter the name of the item:");
                 //stores the user inputted quantity
                int quantity = sc.getInt("Enter the quantity:");
                //creates a new Grocery obj using the user inputted values
                Groceries newItem = new Groceries(itemName, itemCat, quantity );
                //adds the new Grocery obj to the Shopping Cart
                userCart.addItemToCart(newItem);
                //new line
                sc.nextLine();
                //answer determines if the loop will continue (user wants to add more items to the grocery list)
                wantsToEnterItem = sc.yesNo("Would you like to enter a new item?");
                 }

            }

        boolean viewByCategory = sc.yesNo("Would you like to view your grocery list by category?");
        if(viewByCategory) {
            System.out.println("1 - Dairy");
            System.out.println("2 - Meats");
            System.out.println("3 - Fruits");
            System.out.println("4 - Vegetables");
            System.out.println("5 - Snacks");
            selectedCategory= sc.getInt("Select a category.");

            //determines the itemCat based on the value of the selectedCategory
            switch (selectedCategory) {
                case 1:
                    userCart.dairyCategory();
                    break;
                case 2:
                    userCart.meatCategory();
                    break;
                case 3:
                    userCart.fruitCategory();
                    break;
            }
        }
        //if wantsToEnterItem is false
        System.out.println("Thanks for shopping!\n Here is your completed Grocery List:\n");
        userCart.getAllItemsInCart();
        }



    }

