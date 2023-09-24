package Inlamningsuppgift1;

import Exercise10.TestPassword;
import ExtraUppgift.TestInput;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class UI {
    public static void main(String[] args) {

        //En klass med en main-metod som också läser in
        //text och skriver ut text (som den hämtar ifrån logikklasen)

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        System.out.println(text);






    }
    @Test
    public void testValidText(){

        TestInput test = new TestInput();
        boolean expected = false;

        boolean actual = test.check("pass1");

        assertEquals(expected,actual);

    }
}
