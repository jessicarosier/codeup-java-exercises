//  Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
//  Create a method that will return a random element from an array of strings.
//  Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination            and display the generated name to the user

public class ServerNameGenerator {

    String[] adjectives = {"tangy", "fancy", "excited", "yummy", "spooky", "nifty", "apathetic", "beautiful", "violent", "fuzzy"};
    String[] nouns = {"bacon", "army", "avacado", "hospital", "bobcat", "panda", "daisy", "mud", "owl", "horse"};

    public String getRandomElement(String[] elements) {

        int randomNum = (int) (Math.random() * elements.length); //returns an integer between 1 and the length of the passed array
        return elements[randomNum];
    }

    public void getServerName() {
        System.out.println("Here is your server name:");
        System.out.printf("%s-%s\n", this.getRandomElement(this.adjectives), this.getRandomElement(this.nouns));
    }

    public void getServerName(String[] adjectives, String[] nouns) {
        System.out.println("Here is your server name:");
        System.out.printf("%s-%s\n", this.getRandomElement(adjectives), this.getRandomElement(nouns));
    }

    public static void main(String[] args) {

        ServerNameGenerator newGenerator = new ServerNameGenerator();

        newGenerator.getServerName();

    }


}
