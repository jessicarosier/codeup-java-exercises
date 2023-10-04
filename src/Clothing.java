public class Clothing {

    public static void main(String[] args) {
        Clothing item1 = new Clothing();
        item1.type = "pants";
        item1.color = "black";
        item1.size = "medium";
        item1.brand = "Old Navy";
        item1.owner = "Jessica Rosier";
        item1.price = 10.99;

        Clothing item2 = new Clothing();
        item2.type = "shoes";
        item2.color = "black";
        item2.size = "12";
        item2.brand = "Nike";
        item2.owner = "Jordan Rosier";
        item2.price = 100.00;

        System.out.printf("This item of clothing is a pair of %s %s and they are a size %s and they cost $%.2f.\n", item1.color, item1.type, item1.size, item1.price);

        item1.getClothingInfo();

        System.out.println(item1.getOwner());
        System.out.println(item2.getOwner());

        item2.getPrice();

    }

    //constructor
    public Clothing() {
        System.out.println("Created an item of clothing");
    }


    //property fields
    public String color;
    public String type;

    public String size;
    public String brand;
    public String owner;

    public double price;

    //methods

    public void getClothingInfo() {
        System.out.printf("Owner:%s, Type:%s, Color:%s, Size:%s, Brand:%s\n",this.owner, this.type, this.color, this.size, this.brand);
    }

    public String getOwner() {
        return this.owner;
    }

    public void getPrice() {
        System.out.printf("%.2f\n", this.price);
    }





}
