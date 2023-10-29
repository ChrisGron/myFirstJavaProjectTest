package Exercis12;

import java.util.Scanner;

public class TestArrays {
    public static void main(String[] args) {

        //String[] names = {"John","Jim","Karl","Jessica","Jenny"};
        String[] names = new String[5];
        names[0] = "John";
        names[1] = "Jim";
        names[2] = "Karl";
        names[3] = "Jessica";
        names[4] = "Jenny";
        System.out.println("First name " + names[0] + ". Last name " + names[4]);


        String myString = "Hej på dig";
        String[] stringArrray = myString.split(" ");

        for(int i=0;i<stringArrray.length;i++) {
            System.out.println(stringArrray[i]);
        }

        String[] inputNames = new String[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 names");
        for(int i=0;i<inputNames.length;i++){
            inputNames[i] = scan.nextLine();
        }
        System.out.println("First name " + inputNames[0] + ". Last name " + inputNames[4]);
    }
}
