package Exercise7;

import java.util.Scanner;

public class StringManager {
    public static void main(String[] args) {
        String myString = "some text";

        if (myString.equals("some text")){
            System.out.println("it equals");
        }
        if ((myString.length()==9)){
            System.out.println("it same length");
        }

        System.out.println(myString.charAt(6));

        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        for (int i =0;i<text.length();i++){

            if (text.equals("ägg") && i==0){
                System.out.println("ägg är knasigt");
            }
            System.out.println(text.charAt(i));
        }
    }
}
