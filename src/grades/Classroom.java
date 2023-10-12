package grades;

import java.util.ArrayList;

public class Classroom {

    public String name;
    public ArrayList<Student> studentList;

    public ArrayList<Integer> gradeList;

    public int classSize;


    public Classroom(String name) {
        this.name = name;
        studentList = new ArrayList<>();
        gradeList = new ArrayList<>();
    }


    //adds a student to the studentList, and adds their grades to the gradeList
    public void addStudent(Student person) {
        studentList.add(person);
        gradeList.addAll(person.getGrades());
        classSize++;
    }

    //returns the average of the students grades for the entire class
    public double getClassAverage() {
        double total = 0;
        for (int i = 0; i < gradeList.size(); i++) {
            total += gradeList.get(i);
        }
        return total / gradeList.size();
    }


    //prints out a report for each student in the class (name, grade average, attendance percentage)
    public void getClassReport() {
        this.studentList.forEach(student -> {
            System.out.printf("Name: %s\nGrade Average:%.1f\nAttendance Average:%.1f \n\n", student.getName(), student.getGradeAverage(), student.calculateAttendance());
        });
    }





}
