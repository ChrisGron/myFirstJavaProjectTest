package InlamningsUppgiftMorseCode;


import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class MainMorse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Logic newInput = new Logic();
        String translateInput = "";
        while(!translateInput.equals("EXIT") && newInput.validInput) {
            translateInput = scan.nextLine().toUpperCase();
            if (translateInput.isBlank() || translateInput == null) {
                System.out.println("Could not translate, please try again");
            } else {
                newInput.SplitInput(translateInput.trim());

            }
        }
    }

    @Test
    public void TestLowerCase() {
        TestMorseLogic newTest = new TestMorseLogic();
        boolean expected = false;

        boolean actual = newTest.checkRegular("abcdEFghijklmnopQrstuvwxyz");
        assertEquals(expected, actual);
    }

    @Test
    public void TestValidText() {
        TestMorseLogic newTest = new TestMorseLogic();
        boolean expected = true;
        boolean actual = newTest.checkRegular("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        assertEquals(expected, actual);
    }

    @Test
    public void isMorsefromHash() {
        TestMorseLogic newTest = new TestMorseLogic();
        boolean expected = true;
        boolean actual = newTest.checkMorse("*- ****");
        assertEquals(expected, actual);
    }

    @Test
    public void getMorseTranslation() {
        Logic newTest = new Logic();
        String expected = "--*-";
        String actual = newTest.toMorse().get("Q");
        assertEquals(expected, actual);
    }

    @Test
    public void splitInput() {
        TestMorseLogic newTest = new TestMorseLogic();
        boolean expected = true;
        boolean actual = newTest.splitInput("Test input");
        assertEquals(expected, actual);
    }
}
