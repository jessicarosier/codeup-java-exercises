

public class Car {
    //Classes let us define custom objects - imagine it as a blueprint, template, or character sheet to be followed

    //Classes have fields - fields are variables (properties of WHAT a class is) and methods (ACTIONS/BEHAVIORS a class can do)
    //property of person class person.firstName = "Jessica"
    //method of person class = person.performCartwheel

    //First example: Make; model, year, honk() [model + make + " honks its horn!"] fields
    public String make;
    public String model;
    public int year;
    public String owner;
    public String color;

    public void honk(){
        System.out.printf("%s %s %s %s honks its horn!\n", owner, year, make, model);
    }

    public void logCarInfo(){
        System.out.printf("Here is some info about %s's car: %s %s %s\n", owner, year, make, model);
    }


    //Static - an instance of a class (an object) can have individual and unique values to their fields. Non-unique fields are flagged with the 'static' keyword.
    public static int carInventoryCount = 0;

    //Let's look at the Math object
    double piExample = Math.PI; //Command click 'Math' to see the entire object, 'PI' to see the property of the object

    //We usually start using the Math object to think about static since we don't make a unique instance of Math - there is only a global thing CALLED Math that would never have a personal, unique copy of it made (Kenny's Math vs Gilly's Math vs. Gonzo's Math < that doesn't make sense! There is only Math!"

    //Second example: static carInventoryCount property.

    //Constructors - all constructors are methods, all methods can be overloaded.

    //Third example: car constructor method that auto-increments static carInventoryCount when each car is made

    //Fourth example: overloading constructor to allow for missing model / year

    //This - think of it as saying ME, MYSELF, THIS object.

    //Fifth example: logCarInfo()

    //Visibility - let's set up a private String that is carOwner and set up a small application running class called dealershipApp to see if we can access info in the other class.
    public static void main(String[]args){
        Car jessicasCar = new Car();
        jessicasCar.make = "Mazda";
        jessicasCar.model = "CX-50";
        jessicasCar.year = 2023;
        jessicasCar.color = "blue";
        jessicasCar.owner = "Jessica";
        System.out.printf("Here is a car, it's a %s %s %s\n", jessicasCar.year, jessicasCar.make, jessicasCar.model);

        Car jordansCar = new Car();
        jordansCar.make = "Ford";
        jordansCar.model = "F-150";
        jordansCar.year = 2020;
        jordansCar.color = "blue";
        jordansCar.owner = "Jordan";
        System.out.printf("Here is a car, it's a %s %s %s\n", jordansCar.year, jordansCar.make, jordansCar.model);

        jessicasCar.honk();
        jessicasCar.logCarInfo();
        jordansCar.honk();

        Car.carInventoryCount = 0;

        carInventoryCount++;
        System.out.println("What is the car inventory count? " + carInventoryCount);
        carInventoryCount++;
        System.out.println("What is the car inventory count? " + carInventoryCount);


    }

}


