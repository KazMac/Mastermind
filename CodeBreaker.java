/**
 * CodeBreaker
 * @author Karen
 * @version 1
 * Desc: Player breaking the code
 */
package mastermind;

public class CodeBreaker implements Player {
    private Code playerCode;

    public CodeBreaker(){

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

}

