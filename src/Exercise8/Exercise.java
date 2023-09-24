package Exercise8;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char letter = scan.next().charAt(0);

        SpellChecker spell = new SpellChecker();

        if (spell.isLetter(letter)) {
            System.out.println("Its a letter");
        } else {
            System.out.println("Is not a valid letter");
        }

    }
}
