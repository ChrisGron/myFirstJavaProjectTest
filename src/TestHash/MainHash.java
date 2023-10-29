package TestHash;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class MainHash {
    //https://mkyong.com/java/java-how-to-get-keys-and-values-from-map/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String checkValue = "";
        //LogicHash newHashCheck = new LogicHash();
        LogicHash newInput = new LogicHash();
        String[] partInput;


        while(!checkValue.equals("EXIT")) {
            System.out.println("Check the hash: ");

            checkValue = scan.nextLine().toUpperCase();
            if(checkValue.matches("^[0-9A-Z\\s]+$")) {
                partInput = checkValue.split(" ");
                System.out.println("Sent First");
                newInput.CheckInput(partInput, checkValue);

            }else if(checkValue.matches("^[-*\\s;]+$")) {
                //checkValue = checkValue.replaceAll("\\s+","");
                //System.out.println("Check check:" + checkValue);
                if(checkValue.contains(";")){

                    String[] tempPart = checkValue.split(";");//(;)|(\s+)
                    //System.out.println(Arrays.toString(tempPart));
                    //newInput.CheckInput(tempPart, checkValue);


                    for (int i = 0; i<tempPart.length;i++){
                        //System.out.println(tempPart.length);
                        //System.out.println("Has ; " + tempPart[i]);
                        partInput=tempPart[i].split("\\s+");
                        
                        System.out.println("Test:" + Arrays.toString(partInput));
                        //newInput.CheckInput(partInput, checkValue);
                    }


                }else {
                    partInput = checkValue.split(" ");
                    System.out.println("Test: " + Arrays.toString(partInput));
                    newInput.CheckInput(partInput, checkValue);

                }

                //newInput.CheckInput(partInput, checkValue);
            }else {
                System.out.println("Wrong");
            }
            /*
            for (int i = 0; i < partInput.length; i++) {
                for (int b = 0; b < partInput[i].length(); b++) {

                    if (checkValue.matches("^[0-9A-Z-*\\s;]+$")) {
                        newHashCheck.LoopHash(String.valueOf(partInput[i].charAt(b)));

                    } else {
                        System.out.println("Enter valid key");
                    }
                }
            }*/
        }
  /*      HashMap<String, String> testHash = new HashMap<String, String>();

        testHash.put("A","First");
        testHash.put("B","Second");
        testHash.put("C","Third");
        testHash.put("D","Fourth");
        testHash.put("E","Fifth");
        testHash.put("F","Sixth");*/
/*
        Collection<String> values = testHash.values();
        for (String v : values){
            //System.out.println("Values: " + v);
            if (v.equals(checkValue)) {
                System.out.println("Values: " + v);
            }
        }

        testHash.forEach((k, v) ->{

            if (checkValue.equals(k)){
                System.out.println("Key is: " + k + ", and value is: " + v);
            }

            //System.out.println(k + " " + v);
        });

        //System.out.println(testHash.get(1));

        */
    }
}
