package shapes;

import shapes.Circle;
import util.Input;


public class CircleApp {

    public static void main(String[] args) {
        //creates an instance of a scanner
        Input myInput = new Input();

        boolean userAnswer;

        do{
            //stores the radius the user enters into a variable
            double userInput = myInput.getDouble("Enter the radius of a circle:");
            //creates a new circle obj using the radius the user entered
            Circle myCircle = new Circle(userInput);
            //prints the detailed information about the circle, including the radius, area, and circumference
            myCircle.getCircleDetails();

            userAnswer = myInput.yesNo("Do you want to make another circle?");

        } while (userAnswer);




    }



}
