package ExtraUppgift;

import java.util.Scanner;

public class Extra {
    public static void main(String[] args) {
        //krPound();
        gas();
    }
    public static void krPound(){
        Scanner scan = new Scanner(System.in);
        float number = scan.nextFloat();

        float pound;

        pound = number / 10;

        System.out.println(pound + "£");
    }
    public static void gas (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount in liter");
        float amount = scan.nextFloat();
        System.out.println("Enter the price per liter");
        float price = scan.nextFloat();
        System.out.println("Enter discount in %");
        float discount = scan.nextFloat();
        //discount =  discount.replace(" %", "");
        //int discount2 = Integer.parseInt(discount);
        discount = discount/100;
        float newprice = (amount*price)-discount;


        System.out.println(newprice);




    }
}
