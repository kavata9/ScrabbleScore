import java.lang.IllegalArgumentException;
import java.util.HashMap;

public class ScrabbleScorer{
    private String word;
    private  HashMap<Character, Integer> scores
        = new HashMap<>();

    public ScrabbleScorer(String word){
        scores.put('A', 1);
        scores.put('E', 1);
        scores.put('I', 1);
        scores.put('O', 1);
        scores.put('U', 1);
        scores.put('L', 1);
        scores.put('N', 1);
        scores.put('R', 1);
        scores.put('S', 1);
        scores.put('T', 1);
        scores.put('D', 2);
        scores.put('G', 2);
        scores.put('B', 3);
        scores.put('C', 3);
        scores.put('M', 3);
        scores.put('P', 3);
        scores.put('F', 4);
        scores.put('H', 4);
        scores.put('V', 4);
        scores.put('W', 4);
        scores.put('Y', 4);
        scores.put('K', 5);
        scores.put('J', 8);
        scores.put('X', 8);
        scores.put('Q', 10);
        scores.put('Z', 10);
        
   

        if (word.length() > 0 && word.matches("[a-zA-Z]+")){       
            this.word = word.toUpperCase();
        }else{
            throw new IllegalArgumentException("cant accept an empty string");
        }
   }

   public String getWord(){
       return this.word;
   } 
   public void setWord(String newWord){
       this.word = newWord.toUpperCase();
   }
   public int getLetterScore(char letter){
       return this.scores.get(letter);
   }
   public int getScore(){
       int score = 0;

       for (int i = 0 ;i <this.word.length(); i++){
           score +=this.scores.get(this.word.charAt(i));
       }
       return score;
   }
}