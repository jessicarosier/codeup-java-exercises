import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

//        double pi = 3.14159;
//
//        System.out.println("The value of pi is approximately " + pi);
//        System.out.printf("The value of pi is approximately %f", pi);
//        System.out.println();
//
//        Scanner myScanner = new Scanner(System.in);
//        System.out.print("Enter a number...");
//        int userNum = myScanner.nextInt();
//
//        System.out.println("You entered: " + userNum);
//        System.out.print("Enter three separate words:");
//
//        String firstStr = myScanner.next();
//        String secondStr = myScanner.next();
//        String thirdStr = myScanner.next();

//        System.out.println("Your first word was: " + firstStr + ". Your second word was: " + secondStr + ". Your third word was:" + thirdStr);
        Scanner myScanner = new Scanner(System.in);
        myScanner.useDelimiter("/");

//        System.out.println("Enter a full sentence: ");
//        String userInputSentence = myScanner.nextLine();
//        System.out.print("Your sentence was: " + userInputSentence);

        System.out.println("Enter a length and width and height:");
        String length= myScanner.next();
//        System.out.println("Enter a width:");
        String width = myScanner.next();
//        System.out.println("Enter a height:");
        String height = myScanner.next();
//        float area = length * width;
//        float volume = length * width * height;
//        float perimeter = (2 * length) + (2 * width);
//        System.out.printf("\n" + "The area of the classroom is: %.2f \n The perimeter of the classroom is: %.2f \n The volume of the classroom is: %.2f", area, perimeter, volume);
        System.out.println(length + width + height);

    }
}
