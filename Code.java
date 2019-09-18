package mastermind;

public class Code {
    private CodePeg[] code;

    public Code(){
        String[] code ={};
    }
    public Code(String[] generatedCode){
        String[] code = generatedCode;
    }
    public Code(String peg1, String peg2, String peg3, String peg4){
        String[] code = {peg1, peg2, peg3, peg4};
    }
}
