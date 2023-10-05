package movies;

import java.util.Arrays;

public class Movie {

    //fields
    private String name;

    private String category;


    //constructor
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }


    //Getters
    public String getName(){
        return this.name;
    }

    public String getCategory(){
        return this.category;
    }

    public void getMoviesInfo() {
        System.out.printf("%s -- %s\n", this.getName(), this.getCategory());
    }

    public void getDramaMovie() {
        if (this.category.equalsIgnoreCase("drama")) {
            this.getMoviesInfo();
        }
    }

    public void getScifiMovie() {
        if (this.category.equalsIgnoreCase("scifi")) {
            this.getMoviesInfo();
        }
    }

    public void getHorrorMovie() {
        if (this.category.equalsIgnoreCase("horror")) {
            this.getMoviesInfo();
        }
    }

    public void getAnimatedMovie() {
        if (this.category.equalsIgnoreCase("animated")) {
            this.getMoviesInfo();
        }
    }

    public void getMusicalMovie() {
        if (this.category.equalsIgnoreCase("musical")) {
            this.getMoviesInfo();
        }
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }

    public void setCategory(String category){
        this.category = category;
    }


    public static Movie[] addMovie(Movie[] movies, Movie movie) {
        //created a copy of the original object with one additional null index
        Movie[] movieListCopy = Arrays.copyOf(movies, movies.length + 1);
        //give the last index in the array a value of the new movie object
        movieListCopy[movieListCopy.length - 1] = movie;
        //soufs a confirmation message for the user
        System.out.printf("The movie %s with a category of %s has been added!\n", movieListCopy[movieListCopy.length - 1].getName(), movieListCopy[movieListCopy.length - 1].getCategory());
        //return the new object that includes the additional movie
        return movieListCopy;
    }

}
