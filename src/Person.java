public class Person {

    public static void main(String[] args) {
        Person jessica = new Person("Jessica", 32, "female", "student");
        System.out.println(jessica.getBirthYear());

    }


    //constructor, runs automajically when we create a new instance of a class
    public Person(String name, int age, String gender, String occupation) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        System.out.println("A Person is being created!");
    }


    //properties, things that describe a person or unique things that a person has
    public String name;
    public int age;
    public String gender;
    public String occupation;


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

    public int getBirthYear() {
        return 2023 - age;
    }

}

