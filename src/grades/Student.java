package grades;

import java.util.ArrayList;

public class Student {

    private String name;

    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        grades =  new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void getGrades() {
        System.out.println(this.grades);
    }

    public void addGrade(int grade) {
       grades.add(grade);
    }


    //returns the average of the students grades
    public double getGradeAverage() {
        double total = 0;
        for (int i = 0; i < grades.size(); i++) {
            total += grades.get(i);
        }
        return total / grades.size();
    }

}
