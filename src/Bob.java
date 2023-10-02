import java.util.Scanner;


//? = "Sure."
//! = "Whoa, chill out!"
// empty input = "Fine, be that way!
//else = "Whatever."
public class Bob {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);

        boolean talkToBob = true;
        System.out.println("Talk to Bob, you can say anything to him! Enter \"Goodbye\" to end the conversation");

        while (talkToBob) {
            String userInput = myScanner.nextLine();
                if (userInput.endsWith("?")) {
                    System.out.println("Sure.");
                } else if (userInput.endsWith("!")) {
                    System.out.println("Whoa, chill out!");
                } else if (userInput.equals("")) {
                    System.out.println("Fine, be that way!");
                } else {
                    System.out.println("Whatever");
                }

            if(userInput.toLowerCase().equalsIgnoreCase("goodbye")) {
                System.out.println("Thanks for talking to Bob! Goodbye!");
                talkToBob=false;
            }

        }


    }
}
