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

        addPerson(people, new Person("Cali", 6, "female", "house cat"));

    }

    public static Person[] addPerson(Person[] people, Person person) {
        Person[] peopleCopy = Arrays.copyOf(people, people.length + 1);
        peopleCopy[peopleCopy.length - 1] = person;
        System.out.println(peopleCopy.length);
        for (Person persons : peopleCopy) {

            System.out.println(persons.name);
        }
        return peopleCopy;
    }

}
