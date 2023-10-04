import java.util.Arrays;

public class ArraysExercises {



    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Jessica", 32, "female", "student");
        people[1] = new Person("Jordan", 29, "male", "supply technician");
        people[2] = new Person("Christine", 51, "female", "nurse");

        for (Person person : people) {
            System.out.println(person.name);
        }



    }


}
