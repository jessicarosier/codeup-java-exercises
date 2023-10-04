import java.util.Scanner;

//        Game picks a random number between 1 and 100.
//        Prompts user to guess the number.
//        All user inputs are validated.
//        If user's guess is less than the number, it outputs "HIGHER".
//        If user's guess is more than the number, it outputs "LOWER".
//        If a user guesses the number, the game should declare "GOOD GUESS!"
//        Keep track of how many guesses a user makes.
//        Set an upper limit on the number of guesses.

public class HighLow {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Lets play a guessing game! Guess a number between 1 and 100, you have 10 guesses! ");
        int randomNum = (int) (Math.random() * 100 + 1); //returns an integer between 1 and 100

        int userGuess = 0;
        int numOfGuesses = 0;
        while (userGuess != randomNum || numOfGuesses != 10) {
            userGuess = myScanner.nextInt();
            numOfGuesses++;
            if(numOfGuesses == 10) {
                System.out.println("You ran out of guesses!");
                break;
            }

            if (userGuess < randomNum) {
                System.out.println("HIGHER");
            } else if (userGuess > randomNum) {
                System.out.println("LOWER");
            } else {
                System.out.printf("GOOD GUESS! You guessed the number in %d of guesses!", numOfGuesses);
                break;
            }
            System.out.printf("You have %d guesses left!", 10-numOfGuesses);
        }


    }


}
