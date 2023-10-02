public class StringExercise {

    public static void main(String[] args)
    {

        String message = "Hello";
        message = "This";

//
//        System.out.println(message);
//        System.out.println(message == message);
//        System.out.println(message.equals(message));

        char[] helloArray = {'h', 'e', 'l', 'l', 'o', '.'};
        System.out.println(helloArray);
        String helloString = new String(helloArray);
        String world = "World";
        System.out.println(helloString);
        int len = helloString.length();
        System.out.println(len);

        System.out.println(helloString.concat(world));

    }}
