public class Person {


//constructor, runs automajically when we create a new instance of a class
    public Person(String name) {
        this.name = name;
        System.out.println("A Person is being created!");
    }


    //properties, things that describe a person or unique things that a person has
    public String name;
    public String hairColor;
    public int age;
    public int weight;
    public String gender;
    public String occupation;
    public String address;
    public String email;
    public String phoneNumber;
    public String spouse;


    //methods //things a person object can do
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sayHello() {
        System.out.printf("Hello, %s", name);
    }


    public static void main(String[] args) {



    }
}

