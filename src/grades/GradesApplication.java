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

        //New instance of Classroom
        Classroom fenrir = new Classroom("Fenrir");
        //Adds students to the Fenrir Classroom
        fenrir.addStudent(s1);
        fenrir.addStudent(s2);
        fenrir.addStudent(s3);
        fenrir.addStudent(s4);

        //creates a new input (scanner)
        Input sc = new Input();

        //adds the github usernames (keys) from thr HashMap to an ArrayList
        ArrayList<String> usernames = new ArrayList<>();
        usernames.addAll(students.keySet());


        //adds the student objects into an ArrayList named allStudents
        ArrayList<Student> allStudents = new ArrayList<>();
        students.values().forEach(student -> allStudents.add(student));


        //initialize an ArrayList to store all the student grades
        ArrayList<Integer> allGrades = new ArrayList<>();

        //loop through each student object and adds their list on grades to the allGrades ArrayList
        allStudents.forEach(student -> {
            allGrades.addAll(student.getGrades());
        });

        s1.recordAttendance("2023-10-11", "P");
        s1.recordAttendance("2023-10-12", "A");
        s1.recordAttendance("2023-10-13", "A");
        s1.recordAttendance("2023-10-14", "P");
        s1.recordAttendance("2023-10-15", "P");

        System.out.println(s1.calculateAttendance());

        s1.getAbsenceList();



//        System.out.println("1. Get student Info");
//        System.out.println("2. Get class average");
//        System.out.println("3. Get class report");
//        int userSelection = sc.getInt();
//
//        if (userSelection == 1) {
//            do {
//                System.out.println("Welcome!\n Here are the GitHub usernames of our students: \n");
//                usernames.forEach(student -> System.out.printf(" |%s| ", student));
//                System.out.println();
//                String userInput = sc.getString("\nWhich student would you like more information about?");
//                if (!students.containsKey(userInput)) {
//                    System.out.printf("Sorry, no student found with the GitHub user name of '%s' ", userInput);
//                } else {
////                    System.out.printf("Name: %s\nGitHub username: %s\nGrade Average: %.2f\nAll Grades: %s\n", students.get(userInput).getName(), userInput, students.get(userInput).getGradeAverage(), students.get(userInput).getGrades().toString());
//                    System.out.printf("GitHub username: %s\n", userInput);
//                    students.get(userInput).getStudentReport();
//                }
//
//            } while (sc.yesNo("Would you like to see another student?"));
//
//            System.out.println("Goodbye, and have a wonderful day!");
//        } else if (userSelection == 2) {
//
//            System.out.printf("The Class Average is: %.2f", fenrir.getClassAverage());
//        } else if (userSelection == 3) {
//            System.out.println("Detailed Class report:\n");
//            fenrir.getClassReport();
//
//        }


    }
}
