import java.util.Scanner;

//        Game picks a random number between 1 and 100.
//        Prompts user to guess the number.
//        All user inputs are validated.
//        If user's guess is less than the number, it outputs "HIGHER".
//        If user's guess is more than the number, it outputs "LOWER".
//        If a user guesses the number, the game should declare "GOOD GUESS!"

public class HighLow {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Lets play a guessing game! Guess a number between 1 and 100: ");
        int randomNum = (int) (Math.random() * 100 + 1); //returns an integer between 1 and 100
        System.out.println(randomNum);
        int userGuess = 0;
        while (userGuess != randomNum) {
            userGuess = myScanner.nextInt();
            if (userGuess < randomNum) {
                System.out.println("HIGHER");
            } else if (userGuess > randomNum) {
                System.out.println("LOWER");
            } else {
                System.out.println("GOOD GUESS!");
            }
        }




    }


}
