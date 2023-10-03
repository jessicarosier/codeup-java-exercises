import java.util.Scanner;


public class MethodsExercises {
    public static void main(String[] args) {

        diceGame();

    }

    public static int perfAddition(int num1, int num2) {
        return (num1 + num2);
    }

    public static int perfSubtraction(int num1, int num2) {
        return (num1 - num2);
    }

    public static int perfMultiplication(int num1, int num2) {
        return (num1 * num2);
    }

    public static int perfMultiplication2(int num1, int num2) {
        int bucket = 0;

        for (int i = num2; i > num1; i--) {
            bucket += num1;
        }

        return bucket;
    }


    public static int perfDivision(int num1, int num2) {
        return (num1 / num2);
    }

    public static int perfModulus(int num1, int num2) {
        return (num1 % num2);
    }

    public static int getInteger(int min, int max) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("\nEnter a number between %d and %d: ", min, max);
        int userInput = myScanner.nextInt();

        while (userInput < min || userInput > max) {
            System.out.printf("\nEnter a number between %d and %d: ", min, max);
            userInput = myScanner.nextInt();

            //recursion, if the number does not make the above statement false; call the method inside itself again
            return getInteger(min, max);
        }
        return userInput;

    }

    public static String calculateFactorial() {
        long validNum;
        long factorialNum;
        long maxNum = Long.MAX_VALUE;
        long minNum = Long.MIN_VALUE;

        validNum = getInteger(1, 20);
        factorialNum = findFactorial(validNum);

//        do {
//            validNum = getInteger(1, 20);
//            factorialNum = validNum;
//            for (int i = 1; i < validNum; i++) {
//                factorialNum *= i;
//            }
//        } while (factorialNum < maxNum && factorialNum < minNum);

        System.out.printf("%d! = %d\n", validNum, factorialNum);
        return "\n";

    }

    public static long findFactorial(long num) {
        if (num >= 1)
            return num * findFactorial(num - 1);
        else
            return 1;
    }

    public static void count(long n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }

        System.out.println(n);
        count(n - 1);
    }



    //returns boolean if user wants to roll the dice
    public static boolean confirmRollDice() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Do you want to roll the dice? [Y/N] \n");
        String userAnswer = myScanner.nextLine();
        boolean confirmRoll;
        if (userAnswer.equalsIgnoreCase("y")) {
            confirmRoll = true;
        } else {
            System.out.println("Thanks for playing!");
            confirmRoll = false;
        }
        return confirmRoll;
    }

    public static int rollDice(int numSidesOfDice) {
        int dieVal = (int) (Math.random() * numSidesOfDice + 1); //returns an integer
        return dieVal;
    }

    public static void diceGame() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the number of sides on a die:");
        int sidesOfDice = myScanner.nextInt();

        while (confirmRollDice()) {
            System.out.printf("First die value is %d, Second die value is %d\n\n", rollDice(sidesOfDice), rollDice(sidesOfDice));
            rollDice(sidesOfDice);

        }

    }


}





