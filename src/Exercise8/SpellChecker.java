package Exercise8;

public class SpellChecker {
    public boolean isLetter (char sign){

        boolean isLetter = false;

        if ((sign>='a' && sign<='z') || (sign>='A' && sign<='Z')){
            isLetter = true;
        }

        return isLetter;
    }
}
