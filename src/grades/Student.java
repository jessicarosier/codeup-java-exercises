package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    private String name;

    private ArrayList<Integer> grades;

    //stores a date as the key (2017-10-02), and a char representing attendance as a value (A for absent, P for present)
    public HashMap<String, String> attendance;

    public Student(String name) {
        this.name = name;
        grades =  new ArrayList<>();
        attendance = new HashMap<>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
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


    public void recordAttendance(String date, String value) {
        if(date.substring(4,5).equals("-") && value.equals("A") || value.equals("P")) {
            attendance.put(date, value);
        } else {
            System.out.println("Invalid Input");
        }

    }

//Create an instance method on your Student class to calculate a student's attendance percentage -- (Total Days - Absences) / Total Days.
public double calculateAttendance() {
            int totalDays = attendance.size();
            int daysAbsent = 0;

    ArrayList<String> studentStatus = new ArrayList<>();

    studentStatus.addAll(attendance.values());


    for (int i = 0; i < studentStatus.size(); i++) {
        if(studentStatus.get(i).equals("A")) {
            daysAbsent++;
        }
    }
//    System.out.println(daysAbsent);
//    System.out.println(3/5);
    //HAVE TO CAST THIS OTHERWISE WILL RETURN 0 AHHHHHHHHHH !*%##!
    return (double) (totalDays - daysAbsent) / totalDays;

}


//prints out the students name, grade average, all grades, and attendance percentage
public void getStudentReport() {
    System.out.printf("Name: %s\nGrade Average: %.2f\nAll Grades: %s\nAttendance Average: %.2f\n", this.name, this.getGradeAverage(), this.grades.toString(), this.calculateAttendance());
}


//prints out a list of dates that the student was absent
public void getAbsenceList() {
        //buckets to separate the keys and values
    ArrayList<String> dates = new ArrayList<>();
    ArrayList<String> status = new ArrayList<>();

    //adds the keys and values to the buckets
    dates.addAll(attendance.keySet());
    status.addAll(attendance.values());

    //loops through the status bucket and prints the dates at the same index that have an "A" value
    for (int i = 0; i < dates.size(); i++) {
        if(status.get(i).equals("A")) {
            System.out.println(dates.get(i));
        }
    }
}








}
