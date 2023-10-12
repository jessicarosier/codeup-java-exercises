package grocery;
import util.Input;

public class Shopping {

    public static void main(String[] args) {

        Input sc = new Input();
        int selectedCategory;
        String itemCat = new String();

        Boolean wantsToShop = sc.yesNo("Would you like to create a grocery list?");


        ShoppingCart userCart = new ShoppingCart();

        if (wantsToShop) {
             Boolean wantsToEnterItem = sc.yesNo("Would you like to enter a new item?");
            while (wantsToEnterItem) {
                System.out.println("1 - Dairy");
                System.out.println("2 - Meats");
                System.out.println("3 - Fruits");
                 selectedCategory= sc.getInt("Select a category.");

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
                 }

                String itemName = sc.getString("Enter the name of the item:");
                int quantity = sc.getInt("Enter the quantity:");
                Groceries newItem = new Groceries(itemName, itemCat, quantity );
                userCart.addItemToCart(newItem);
                sc.nextLine();
                wantsToEnterItem = sc.yesNo("Would you like to enter a new item?");
            }

            }
        System.out.println("Thanks for shopping!");
        }



    }

