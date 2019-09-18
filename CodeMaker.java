/**
 * CodeMaker
 * @author Karen
 * @version 1
 * Desc: player generating code to break
 */
package mastermind;

import java.util.Random;

public class CodeMaker implements Player {
    private Code playerCode;

    public CodeMaker(){
        generateNewCode();
    }
    /*
     * getter for player code
     * */
    public Code getPlayerCode(){
        return playerCode;
    }

    /*
     * setter for player code
     * */
    public void setPlayerCode(Code newCode){
        this.playerCode = newCode;

    }
    /*
    * Randomly generate code to be broken
    * */
    public void generateNewCode(){
        Random random = new Random();
        String codePegValues[] = CodePeg.values();
        String generatedCode[];

        for(int i=0; i<4; i++){
            int randomInteger = random.nextInt(6);
            generatedCode[i] = codePegValues[randomInteger-1];           // minus 1 to align with array
        }

        Code playerCode = new Code(generatedCode);
        this.setPlayerCode(playerCode);
    }
}
