package grades;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import util.Input;


public class GradesApplication {

    public static void main(String[] args) {

        //K:usernames V: Student Objects
        HashMap<String, Student> students = new HashMap<>();

        Student s1 = new Student("Jessica");
        s1.addGrade(90);
        s1.addGrade(82);
        s1.addGrade(98);
        Student s2 = new Student("Jordan");
        s2.addGrade(77);
        s2.addGrade(100);
        s2.addGrade(92);
        Student s3 = new Student("Jax");
        s3.addGrade(50);
        s3.addGrade(68);
        s3.addGrade(72);
        Student s4 = new Student("Cali");
        s4.addGrade(78);
        s4.addGrade(85);
        s4.addGrade(90);

        students.put("jessicarosier", s1);
        students.put("roseman", s2);
        students.put("jax2cool", s3);
        students.put("cali-vibes", s4);

        students.get("jessicarosier").getGrades();


        Input sc = new Input();

        ArrayList<String> usernames = new ArrayList<>();
        usernames.addAll(students.keySet());


       do {
           System.out.println("Welcome!\n Here are the GitHub usernames of our students: \n");
           usernames.forEach(student -> System.out.printf(" |%s| ", student));
           System.out.println();
           String userInput =  sc.getString("\nWhich student would you like more information about?");
           if(!students.containsKey(userInput) ) {
               System.out.printf("Sorry, no student found with the GitHub user name of '%s' ", userInput);
           } else {
               System.out.printf("Name: %s\nGitHub username: %s\nGrade Average: %.2f\n", students.get(userInput).getName(), userInput, students.get(userInput).getGradeAverage());
           }

       }while(sc.yesNo("Would you like to see another student?"));

        System.out.println("Goodbye, and have a wonderful day!");


    }
}
