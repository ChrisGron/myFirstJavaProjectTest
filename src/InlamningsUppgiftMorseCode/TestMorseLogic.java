package InlamningsUppgiftMorseCode;

public class TestMorseLogic {

    public boolean checkRegular(String test) {
        return test.matches("^[0-9A-Z\\s]+$");
    }

    public boolean checkMorse(String test) {
        return test.matches("^[-*\\s;]+$");
    }

    public boolean splitInput(String test) {
        boolean rightSize = false;
        String[] testSplit = test.split(" ");
        if(testSplit.length==2){
            rightSize = true;
        }
        return rightSize;
    }
}
