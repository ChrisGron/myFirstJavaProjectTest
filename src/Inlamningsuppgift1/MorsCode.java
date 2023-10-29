package Inlamningsuppgift1;

import java.util.HashMap;

public class MorsCode {

    // En logikklass
    // Loop for input and do some checks
    // Make everything lowercase
    // Split input between letters and *_
    // Run though each letter from 0 and check and save translation to new string
    // space should be ; and ; should be space

    //public String morseCode (String key){
    public HashMap<String, String> morseCode(){
        //int MorseSize;
        HashMap<String, String> morseCodeTranslator = new HashMap<String, String>();
        morseCodeTranslator.put("A","*-");
        morseCodeTranslator.put("B","-***");
        morseCodeTranslator.put("C","-*-*");
        morseCodeTranslator.put("D","-**");
        morseCodeTranslator.put("E","*");
        morseCodeTranslator.put("F","**-*");
        morseCodeTranslator.put("G","--*");
        morseCodeTranslator.put("H","****"); //****;*;*---
        morseCodeTranslator.put("I","**");
        morseCodeTranslator.put("J","*---");
        morseCodeTranslator.put("K","-*-");
        morseCodeTranslator.put("L","*-**");
        morseCodeTranslator.put("M","--");
        morseCodeTranslator.put("N","-*");
        morseCodeTranslator.put("O","---");
        morseCodeTranslator.put("P","*--*");
        morseCodeTranslator.put("Q","--*-");
        morseCodeTranslator.put("R","*-*");
        morseCodeTranslator.put("S","***");
        morseCodeTranslator.put("T","-");
        morseCodeTranslator.put("U","**-");
        morseCodeTranslator.put("V","***-");
        morseCodeTranslator.put("W","*--");
        morseCodeTranslator.put("X","-**-");
        morseCodeTranslator.put("Y","-*--");
        morseCodeTranslator.put("Z","--**");
        morseCodeTranslator.put("1","*----");
        morseCodeTranslator.put("2","**---");
        morseCodeTranslator.put("3","***--");
        morseCodeTranslator.put("4","****-");
        morseCodeTranslator.put("5","*****");
        morseCodeTranslator.put("6","-****");
        morseCodeTranslator.put("7","--***");
        morseCodeTranslator.put("8","---**");
        morseCodeTranslator.put("9","----*");
        morseCodeTranslator.put("0","-----");
        morseCodeTranslator.put(".","*-*-*-");
        morseCodeTranslator.put(",","--**--");
        morseCodeTranslator.put("?","**--**");

        //MorseSize = morseCodeTranslator.size();
        //Borde kanske använda entrySet() och entry.getKey()
        //return morseCodeTranslator.get(key);
        return morseCodeTranslator;

    }

/*
    public void InputArray (String Input, boolean isMorse){
        MorsCode Morse = new MorsCode();
        String[] part = Input.split(" ");
        String translatedText = "";

        if(isMorse){
            for (int i= 0; i< part.length; i++){
                System.out.println("morse code test array");
            }
        }else{
            for (int i= 0; i< part.length; i++){

                //if(part.length>=1) {
                    for (int b = 0; b < part[i].length(); b++) {
                        translatedText = translatedText + Morse.morseCode(String.valueOf(part[i].charAt(b)));
                    }
                //}
            }
        }
        System.out.println(translatedText);

    }

*/


    public void textIsMorse (){
        System.out.println("morse");
    }
    public void textIsLetters(){
        System.out.println("is letter");
    }
}
