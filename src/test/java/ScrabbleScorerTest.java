import org.junit.Test;
import static org.junit.Assert.*;

public class ScrabbleScorerTest {
    @Test public void testScrabbleScorerInstatiatesCorrectly() {
         ScrabbleScorer scorer= new ScrabbleScorer("moringa");
        assertNotNull(scorer);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDoesnotInstatiateWithEmptyString() {
        ScrabbleScorer scorer = new ScrabbleScorer("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDoesnotInstatiateWithNumbers() {
        ScrabbleScorer scorer= new ScrabbleScorer("moringa-core-9");
    }

    @Test public void testCanGetWord() {
         ScrabbleScorer scorer= new ScrabbleScorer("moringa");
         String expected = "MORINGA";
         assertEquals(expected, scorer.getWord());
    } 

    @Test public void testCanSetWord() {
         ScrabbleScorer scorer= new ScrabbleScorer("moringa");
         scorer.setWord("java");
         String expected = "JAVA";
         assertEquals(expected, scorer.getWord());
    }
    
    @Test public void testCanGetScore() {
        ScrabbleScorer scorer= new ScrabbleScorer("moringa");
        int expected = 10;
        assertEquals(expected, scorer.getScore());
    }    
}