package InlamningsUppgiftMorseCode;

import java.util.Arrays;
import java.util.HashMap;

public class Logic {
    //To DO
    //Valid morse in invalid configurations

    public HashMap<String, String> toMorse() {
        //int MorseSize;
        HashMap<String, String> toMorseCodeTranslator = new HashMap<String, String>(); //abcd EFghijk lmnopQrstuvw xyz 0123456789 .,?
        toMorseCodeTranslator.put("A", "*-");
        toMorseCodeTranslator.put("B", "-***");
        toMorseCodeTranslator.put("C", "-*-*");
        toMorseCodeTranslator.put("D", "-**");
        toMorseCodeTranslator.put("E", "*");
        toMorseCodeTranslator.put("F", "**-*");
        toMorseCodeTranslator.put("G", "--*");
        toMorseCodeTranslator.put("H", "****");
        toMorseCodeTranslator.put("I", "**");
        toMorseCodeTranslator.put("J", "*---");
        toMorseCodeTranslator.put("K", "-*-");
        toMorseCodeTranslator.put("L", "*-**");
        toMorseCodeTranslator.put("M", "--");
        toMorseCodeTranslator.put("N", "-*");
        toMorseCodeTranslator.put("O", "---");
        toMorseCodeTranslator.put("P", "*--*");
        toMorseCodeTranslator.put("Q", "--*-");
        toMorseCodeTranslator.put("R", "*-*");
        toMorseCodeTranslator.put("S", "***");
        toMorseCodeTranslator.put("T", "-");
        toMorseCodeTranslator.put("U", "**-");
        toMorseCodeTranslator.put("V", "***-");
        toMorseCodeTranslator.put("W", "*--");
        toMorseCodeTranslator.put("X", "-**-");
        toMorseCodeTranslator.put("Y", "-*--");
        toMorseCodeTranslator.put("Z", "--**");
        toMorseCodeTranslator.put("1", "*----");
        toMorseCodeTranslator.put("2", "**---");
        toMorseCodeTranslator.put("3", "***--");
        toMorseCodeTranslator.put("4", "****-");
        toMorseCodeTranslator.put("5", "*****");
        toMorseCodeTranslator.put("6", "-****");
        toMorseCodeTranslator.put("7", "--***");
        toMorseCodeTranslator.put("8", "---**");
        toMorseCodeTranslator.put("9", "----*");
        toMorseCodeTranslator.put("0", "-----");
        toMorseCodeTranslator.put(".", "*-*-*-");
        toMorseCodeTranslator.put(",", "--**--");
        toMorseCodeTranslator.put("?", "**--**");
        return toMorseCodeTranslator;

    }

    public HashMap<String, String> fromMorse() {
        //int MorseSize;
        HashMap<String, String> fromMorseCodeTranslator = new HashMap<String, String>();//**** * *---;- * *** -; **--- ---** ; ----- **--**
        fromMorseCodeTranslator.put("*-", "A");
        fromMorseCodeTranslator.put("-***", "B");
        fromMorseCodeTranslator.put("-*-*", "C");
        fromMorseCodeTranslator.put("-**", "D");
        fromMorseCodeTranslator.put("*", "E");
        fromMorseCodeTranslator.put("**-*", "F");
        fromMorseCodeTranslator.put("--*", "G");
        fromMorseCodeTranslator.put("****", "H");
        fromMorseCodeTranslator.put("**", "I");
        fromMorseCodeTranslator.put("*---", "J");
        fromMorseCodeTranslator.put("-*-", "K");
        fromMorseCodeTranslator.put("*-**", "L");
        fromMorseCodeTranslator.put("--", "M");
        fromMorseCodeTranslator.put("-*", "N");
        fromMorseCodeTranslator.put("---", "O");
        fromMorseCodeTranslator.put("*--*", "P");
        fromMorseCodeTranslator.put("--*-", "Q");
        fromMorseCodeTranslator.put("*-*", "R");
        fromMorseCodeTranslator.put("***", "S");
        fromMorseCodeTranslator.put("-", "T");
        fromMorseCodeTranslator.put("**-", "U");
        fromMorseCodeTranslator.put("***-", "V");
        fromMorseCodeTranslator.put("*--", "W");
        fromMorseCodeTranslator.put("-**-", "X");
        fromMorseCodeTranslator.put("-*--", "Y");
        fromMorseCodeTranslator.put("--**", "Z");
        fromMorseCodeTranslator.put("*----", "1");
        fromMorseCodeTranslator.put("**---", "2");
        fromMorseCodeTranslator.put("***--", "3");
        fromMorseCodeTranslator.put("****-", "4");
        fromMorseCodeTranslator.put("*****", "5");
        fromMorseCodeTranslator.put("-****", "6");
        fromMorseCodeTranslator.put("--***", "7");
        fromMorseCodeTranslator.put("---**", "8");
        fromMorseCodeTranslator.put("----*", "9");
        fromMorseCodeTranslator.put("-----", "0");
        fromMorseCodeTranslator.put("*-*-*-", ".");
        fromMorseCodeTranslator.put("--**--", ",");
        fromMorseCodeTranslator.put("**--**", "?");
        return fromMorseCodeTranslator;

    }

    public void SplitInput (String checkValue){
        String[] newSplit;
        String[] tempPart;

        boolean morseCode = false;

        if(checkValue.matches("^[0-9A-Z\\s?.,]+$")) {
            newSplit = checkValue.split("\\s");
            //System.out.println(Arrays.toString(newSplit));
            LoopInput(newSplit,morseCode);
        }else if(checkValue.matches("^[-*\\s;]+$")) {
            morseCode = true;
            tempPart = checkValue.split(";");

            for (int i = 0; i<tempPart.length;i++){
                tempPart[i] = tempPart[i].trim();
                //System.out.println(tempPart.length);
                //System.out.println("Has ; " + tempPart[i]);
                newSplit=tempPart[i].split("\\s+");
                //System.out.println("Test:" + Arrays.toString(newSplit));
                //System.out.println("Test:" + newSplit.length);
                LoopInput(newSplit,morseCode);


            }
        }else {
            System.out.println("Could not translate, please try again");
        }

    }
    public void LoopInput (String[] splitInput,boolean morseCode){
        //TO DO
        //Handle extra space

        for (int i = 0; i < splitInput.length; i++) {

            if(morseCode) {
                //System.out.println("Is Morse");
                System.out.print(fromMorse().get(splitInput[i]));

            }else if(!morseCode) {
                for (int b = 0; b < splitInput[i].length(); b++) {
                    //System.out.println("Is not Morse");
                    System.out.print(toMorse().get(String.valueOf(splitInput[i].charAt(b))));
                    if(i < splitInput.length || b < splitInput.length-1 ) {
                        System.out.print(" ");
                    }

                }
                if(i < splitInput.length-1) {
                    System.out.print(";");
                }
            }else {
                System.out.println("Could not translate");
            }
        }
        if (morseCode){
            System.out.print(" ");
        }

    }


}
