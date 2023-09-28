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
//        System.out.print("Enter three seperte words:");
//
//        String firstStr = myScanner.next();
//        String secondStr = myScanner.next();
//        String thirdStr = myScanner.next();

//        System.out.println("Your first word was: " + firstStr + ". Your second word was: " + secondStr + ". Your third word was:" + thirdStr);
        Scanner myScanner = new Scanner(System.in);
//        System.out.println("Enter a full sentence: ");
//        String userInputSentence = myScanner.nextLine();
//
//        System.out.print("Your sentence was: " + userInputSentence);

        System.out.println("Enter a length");
        int length = Integer.parseInt(myScanner.nextLine());
        System.out.println("Enter a height");
        int width = Integer.parseInt(myScanner.nextLine());
        int area = length * width;
        int perimeter = (2 * length) + (2 * width);
        System.out.println("The area of the classroom is: " + area + "\n" + "The perimeter of the classroom is: " + perimeter);

    }
}
