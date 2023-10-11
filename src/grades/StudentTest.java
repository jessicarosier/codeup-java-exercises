package grades;

public class StudentTest {

    public static void main(String[] args) {
        Student newStudent = new Student("Jessica");

        newStudent.addGrade(10);
        newStudent.addGrade(50);
        newStudent.addGrade(30);
        newStudent.addGrade(68);

        System.out.println(newStudent.getGradeAverage());
    }
}
