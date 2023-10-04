package util;

import java.util.Scanner;


public class Input {

    public static void main(String[] args) {

        Input myInput = new Input();
//        myInput.getSring();

//        myInput.yesNo();

        System.out.println(myInput.getInt(1, 10));

    }

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public void getSring() {
        String newString = scanner.nextLine();
        System.out.println(newString);
    }

    public boolean yesNo() {
        String newBool = scanner.nextLine();
        if ( newBool.equalsIgnoreCase("y")||newBool.equalsIgnoreCase("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        System.out.printf("Enter a number between %d and %d", min, max);
        int userNum = scanner.nextInt();

        if (userNum < min || userNum > max) {
            getInt(min, max);
        }

        return userNum;
    }

    public void getInt() {
        int userNum = scanner.nextInt();
        System.out.println(userNum);
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter a number between %d and %d", min, max);
        double userNum = scanner.nextDouble();

        if (userNum < min || userNum > max) {
            getDouble(min, max);
        }

        return userNum;

    }

    public void getDouble() {
        double userNum = scanner.nextDouble();
        System.out.println(userNum);
    }




}
