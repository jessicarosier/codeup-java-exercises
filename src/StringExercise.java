import java.util.Scanner;


public class StringExercise {

    public static void main(String[] args) {
// a string is a reference type (specifically an object)
// two strings cannot have the exact same literal value. The second string will hold a pointer/reference to the first declared string.
// when they are compared with a "=="; true will be returned because the second string IS the first string, its just referencing the first string


        //Strings are immutable w/example
        String message = "Hello";
        //The string literal of"Hello" is NOT being changed, it is immutable
        //Instead, we are changing what the variable is referencing
        message = "World";

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the letter I:");
//        String userInput = scanner.nextLine();
//        System.out.println(userInput.toLowerCase().startsWith("i"));

//        String myName = "Jessica Rosier";
//        //returns a boolean to indicate is the string starts with the specified string
//        System.out.println(myName.startsWith("Jes")); //true
//        //returns a boolean to indicate is the string ends with the specified string
//        System.out.println(myName.endsWith("ier")); //true
//        //returns a boolean to indicate is the string contains specified string
//        System.out.println(myName.contains("ss")); //true
//        //returns the character that is at the specified index
//        System.out.println(myName.charAt(0)); // J
//        //returns the character at the last index of the string
//        System.out.println(myName.charAt(myName.length()-1));
//        //returns the index of the specified character of a string
//        System.out.println(myName.indexOf("c"));
//        //Does not alter the original string object that myName references
//        System.out.println(myName.replace("Rosier", "Pozier"));
//
//        System.out.println(myName.substring(0, 7));
//        System.out.println(myName.substring(8));


//        We don't need no education
//        We don't need no thought control
        String educationMessage = "We don't need no education";
        System.out.printf("%s\n%s", educationMessage,educationMessage.replace("education", "thought control"));


//        Check "this" out!, "s inside of "s!
        String checkItOut = "s inside of ";
        System.out.printf("\n%s %c%s%c %s %c%s%c%s", "Check", '"',"this", '"', "out!,", '"', checkItOut, '"', "s!");

//        In windows, the main drive is usually C:\
        String inWindows = "In windows, the main drive is usually C:\\";
        System.out.printf("\n%s", inWindows);

//        I can do backslashes \, double backslashes \\,
//        and the amazing triple backslash \\\!
        String backSlashes = "I can do backslashes \\, double backslashes \\\\,";
        System.out.printf("\n%s\n%s", backSlashes, "and the amazing triple backslash \\\\\\!");


    }
}
