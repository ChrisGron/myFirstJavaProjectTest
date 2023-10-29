package TestHash;

import java.util.Arrays;
import java.util.HashMap;

public class LogicHash {

    public HashMap<String, String> getHash(){

        HashMap<String, String> testHash = new HashMap<String, String>();
        testHash.put("A","*-");
        testHash.put("B","-***");
        testHash.put("C","-*-*");
        testHash.put("D","-**");
        testHash.put("E","*");
        testHash.put("F","**-*");
        testHash.put("G","--*");
        testHash.put("H","****");
        testHash.put("I","**");
        testHash.put("J","*---");
        testHash.put("K","-*-");
        testHash.put("L","*-**");
        testHash.put("M","--");
        testHash.put("N","-*");
        testHash.put("O","---");
        testHash.put("P","*--*");
        testHash.put("Q","--*-");
        testHash.put("R","*-*");
        testHash.put("S","***");
        testHash.put("T","-");
        testHash.put("U","**-");
        testHash.put("V","***-");
        testHash.put("W","*--");
        testHash.put("X","-**-");
        testHash.put("Y","-*--");
        testHash.put("Z","--**");
        testHash.put("1","*----");
        testHash.put("2","**---");
        testHash.put("3","***--");
        testHash.put("4","****-");
        testHash.put("5","*****");
        testHash.put("6","-****");
        testHash.put("7","--***");
        testHash.put("8","---**");
        testHash.put("9","----*");
        testHash.put("0","-----");
        testHash.put(".","*-*-*-");
        testHash.put(",","--**--");
        testHash.put("?","**--**");

        return testHash;

    }

    public void LoopHash (String checkValue){
        //MorsCode Morse = new MorsCode();
        LogicHash Hash = new LogicHash();
        //boolean checkTrue = false;

        Hash.getHash().forEach((k, v) ->{
            //boolean checkTrue = false;
            if (checkValue.equals(k)){
              //  checkTrue = true;
                System.out.print(v + " ");
            }else if(checkValue.equals(v)){
                //checkTrue = true;
                System.out.print(k);
            }

            //System.out.println(k + " " + v);
        });
        /*if(!checkTrue){
            System.out.println("Nothing was found");
        }*/
    }
    public void CheckInput (String[] partInput, String checkValue){
        LogicHash newHashCheck = new LogicHash();
        //System.out.print("Translation is: " + Arrays.toString(partInput));
        for (int i = 0; i < partInput.length; i++) {

            for (int b = 0; b < partInput[i].length(); b++) {

                //if (checkValue.matches("^[0-9A-Z-*\\s;]+$")) {
                if (checkValue.matches("^[0-9A-Z\\s]+$")) {
                    //System.out.println("Regular");
                    //newHashCheck.LoopHash(String.valueOf(partInput[i].charAt(b)));

                } else if (checkValue.matches("^[-*\\s]+$")) {
                    System.out.println("Morse");
                    //newHashCheck.LoopHash(String.valueOf(partInput[i]));
                }
            }
        }
    }
}
