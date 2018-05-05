import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        ScrabbleScorer scorer;
        
        System.out.println("Please enter a word:");

        // String pattern = "\w";
        String word = Scanner.nextLine();
    try {
        scorer = new ScrabbleScorer(word);
        System.out.println(word + "has" + scorer.getScore() + "points");
    } catch (IllegalArgumentException e) {
       System.out.println("The word can only contain alphabetical character");
       } 
    }

}