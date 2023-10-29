package Inlamningsuppgift1;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

public class MainTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toUpperCase();
        MorsCode Morse = new MorsCode();
        String morseLoop;
        String morsBuilder = "";
        // String[] entireInput = new String[input.length()];
        //System.out.println(Morse.morseCode().values()); // use values to get the morsecode
        //System.out.println(Morse.morseCode().keySet());
        //Morse.morseCode().entrySet();


        String[] partInput = input.split(" ");


        //System.out.println(entireInput);
        //System.out.println(partInput.length);
        if (input.matches("^[0-9A-Z\\s;]+$")) {
            for (int i = 0; i < partInput.length; i++) {
                for (int b = 0; b < partInput[i].length(); b++) {
                    //System.out.println(partInput[i].length());
                    //System.out.print(Morse.morseCode(String.valueOf(input.charAt(i))));
                    //System.out.print(Morse.morseCode(String.valueOf(partInput[i].charAt(b))));
                    System.out.print(Morse.morseCode().get(String.valueOf(partInput[i].charAt(b))));
                    //System.out.println(entireInput[i]);
                    //System.out.println(partInput[i]);
                }
                if (partInput.length > 1) {
                    System.out.print(" ");
                }
            }
        } else if (input.matches("^[-*\\s]+$")) {
            System.out.println("did morsecode");
            //System.out.println(Morse.morseCode().size());
            //System.out.println(partInput.length);

            for (int i = 0; i < partInput.length; i++) {
                for (int b = 0; b < partInput[i].length(); b++) {
                    //System.out.println("part " + i + " lenght: " +partInput[i].length());
                    morseLoop = String.valueOf(partInput[i]);
                    //System.out.println(Morse.morseCode().size());
                    //System.out.println("loop: " + morseLoop);
                    for (int c = 0; c < Morse.morseCode().size(); c++) {


                        String finalMorseLoop = morseLoop;
                        Morse.morseCode().forEach((k, v) -> {
                            //System.out.println("Key: " + k + ", Value: " + v);

                            if (finalMorseLoop.equals(v)) {

                                System.out.print(k);
                            }

                            //if (morseLoop.equals(k)){
                            //    System.out.println("Key is: " + k + ", and value is: " + v);
                            //}

                            //System.out.println(k + " " + v);
                        });

                        //if (Morse.morseCode().get(String.valueOf(partInput[i].charAt(b)))){
                        //}

                        //if (morseLoop.equals(Morse.morseCode(String.valueOf(c)))) {
                        //    morsBuilder = Morse.morseCode(String.valueOf(c));
                        //    morsBuilder = "TEST";
                        //}
                        /*
                        String finalMorseLoop = morseLoop;
                        Morse.morseCode().forEach((k, v) ->{

                            if (finalMorseLoop.equals(v)){
                                morsBuilder = morsBuilder + k;
                                System.out.println("Key is: " + k + ", and value is: " + v);
                            }

                            //System.out.println(k + " " + v);
                        });

                         */


                    }
                }
                //System.out.print("test the bulder: " + morsBuilder);

            }
            if (partInput.length > 1) {
                System.out.print(" ");
            }


        } else {
            System.out.println("Not valid input, please enter more code or text");
        }
    }
}
