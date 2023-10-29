package Inlamningsuppgift1;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class MainInput {
    public static void main(String[] args) {

        //En klass med en main-metod som också läser in
        //text och skriver ut text (som den hämtar ifrån logikklasen)

        Scanner scan = new Scanner(System.in);
        String text = "";
        //String textTest = "Hej";
        //if ((textTest.charAt(0) == '*') || (textTest.charAt(0) == '-')) {
        //    System.out.println("morse");
        //}
        while (!text.equals("EXIT")) {
            System.out.println("Enter valid text or morse code. Enter Exit to escape");
            text = scan.nextLine().toUpperCase();
            MorsCode Morse = new MorsCode();
            if ((text.charAt(0) == '*') || (text.charAt(0) == '-')) {
                //MorsCode Morse = new MorsCode();
                //Morse.textIsMorse();
                //System.out.println(Morse.morseCode(text));

            } else if (text.matches("[A-Z0-9.,? ]")) { // (Character.isLetter(text.charAt(0)))
                //MorsCode Morse = new MorsCode();
                //Morse.textIsLetters();
                //System.out.println("HashMapTest:");

                //System.out.println(Morse.morseCode(text));

                //Morse.InputArray(text,false);
                //Morse.InputArray("Hej",false);
            }else {
                System.out.println("is not valid text, please enter valid text or mose code");
            }
            System.out.println(text);


        }

        System.out.println(text);


    }

    @Test
    public void TestValidEmpty() {

        TestInput test = new TestInput();
        boolean expected = true;

        boolean actual = test.checkEmpty("Az*-");
        assertEquals(expected, actual);
    }

    @Test
    public void TestValidLetters() {
        TestInput test = new TestInput();
        boolean expected = true;

        boolean actual = test.check("abCdefghijklmnopqrstuvwxyz");
        assertEquals(expected, actual);
    }
    @Test
    public void TestValidMorse() {
        TestInput test = new TestInput();
        boolean expected = true;

        boolean actual = test.check("*");
        assertEquals(expected, actual);
    }

    @Test
    public void TestCanHaveSpace() {
        TestInput test = new TestInput();
        boolean expected = true;

        boolean actual = test.checkSpace(" a*-");
        assertEquals(expected, actual);
    }
    @Test
    public void TestCharSpaceChar() {
        TestInput test = new TestInput();
        boolean expected = true;

        boolean actual = test.checkSpaceBetween("a a");
        assertEquals(expected, actual);
    }

}
