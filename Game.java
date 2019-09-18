/*
*
* */
package mastermind;

import java.util.Arrays;

public class Game {
    private int numberOfGames;
    private final int MAX_GUESSES = 10;

    public Game(int numberOfRounds){
        Player codeMakerPlayer = new CodeMaker();
        Player codeBreakerPlayer = new CodeBreaker();
        numberOfGames = numberOfRounds;
    }

    /*
    * Compare codes for exact match
    * */
    public boolean compareExactCodeMatch(Code codeSolution, Code codeGuessed){

        if (Arrays.equals(codeSolution, codeGuessed))
            return true;
        else
            return false;
    }

    /*
    * Determine number of pegs correct by comparing codes
    * */
 /*   public void compareCodes(Code codeSolution, Code codeGuessed){
        for (String codeChecked:codeGuessed){
            if(codeChecked == )
        }
*/
}
