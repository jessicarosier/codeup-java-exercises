package util;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;


public class Input {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        String newString = scanner.nextLine();
        System.out.println(newString);
        return newString;
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        String newString = scanner.nextLine();
        System.out.println(newString);
        return newString;

    }

    public boolean yesNo() {
        String newBool = scanner.nextLine();
        if (newBool.equalsIgnoreCase("y")||newBool.equalsIgnoreCase("yes")) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        scanner.nextLine();
        String newBool = scanner.nextLine();
        if (newBool.equalsIgnoreCase("y")||newBool.equalsIgnoreCase("yes")) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }



    public int getInt(int min, int max) {
        System.out.printf("Enter a number between %d and %d\n", min, max);
        int userNum = scanner.nextInt();

        if (userNum < min || userNum > max) {
            getInt(min, max);
        }

        return userNum;
    }


    public int getInt() {
        int userNum = scanner.nextInt();
        System.out.println(userNum);
        return userNum;
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        int userNum = scanner.nextInt();
        System.out.println(userNum);
        return userNum;
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter a number between %f and %f\n", min, max);
        double userNum = scanner.nextDouble();

        if (userNum < min || userNum > max) {
            getDouble(min, max);
        }

        return userNum;

    }

    public double getDouble() {
        double userNum = scanner.nextDouble();
        System.out.println(userNum);
        return userNum;
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        double userNum = scanner.nextDouble();
        System.out.println(userNum);
        return userNum;
    }




}
