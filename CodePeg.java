/**
 * CodePeg
 * @author Karen
 * @version 1
 * Desc: colored peg used in code
 */
package mastermind;

public enum CodePeg {
    RED("red"),
    BLUE("blue"),
    GREEN("green"),
    WHITE("white"),
    BLACK("black"),
    YELLOW("yellow")

    private String codePegString;

    /*
     * Intialise code peg colour string
     * @param codePegColour colour of code peg
     * */
    CodePeg(String codePegString){
        this.codePegString = codePegString;
    }

    /*
     * @return peg colour as a string
     * */
    public String toString(){
        return codePegString;
    }
}

