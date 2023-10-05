package movies;

import java.util.Arrays;
import java.util.Scanner;


public class MoviesApplication {

    public static void main(String[] args) {

        Movie[] movieList = Arrays.copyOf(MoviesArray.findAll(), MoviesArray.findAll().length);
//        System.out.println(movieList[0].getName());
//        for(Movie movies : movieList) {
//            System.out.printf("Movie Name: %s, Category: %s\n", movies.getName(), movies.getCategory());
//        }
//
//        for(Movie movies : movieList) {
//            movies.getScifiMovie();
//        }

        Boolean userContinue = true;

        do {
            Scanner newScanner = new Scanner(System.in);
            System.out.println("What would you like to do?\n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n" +
                    "6 - view movies in the musical category\n" +
                    "7 - Add a new Movie to the list\n" +
                    "\n" +
                    "Enter your choice: \n");
            int userChoice = newScanner.nextInt();
            newScanner.nextLine();

            if (userChoice == 0) {
                userContinue = false;
                return;
            } else if (userChoice == 1) {
                for (Movie movies : movieList) {
                    movies.getMoviesInfo();
                }
            } else if (userChoice == 2) {
                for (Movie movies : movieList) {
                    movies.getAnimatedMovie();
                }
            } else if (userChoice == 3) {
                for (Movie movies : movieList) {
                    movies.getDramaMovie();
                }
            } else if (userChoice == 4) {
                for (Movie movies : movieList) {
                    movies.getHorrorMovie();
                }
            } else if (userChoice == 5) {
                for (Movie movies : movieList) {
                    movies.getScifiMovie();
                }
            } else if (userChoice == 6) {
                for (Movie movies : movieList) {
                    movies.getMusicalMovie();
                }
            } else if (userChoice == 7) {
                System.out.println("Enter a Movie name:\n");
                String userMovie = newScanner.nextLine();
                System.out.println("Enter a category:\n");
                String userCategory = newScanner.nextLine();

                Movie.addMovie(movieList, new Movie(userMovie, userCategory));

            }
        } while (userContinue);



    }
}
