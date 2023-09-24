package Excersice1;

public class MyInteger {

    public static void main(String[] args) {
        int number = 5;
        int nextNumber = 6;

        number = 5 + 3;
        nextNumber = number +1;

        System.out.println(number);
        System.out.println(nextNumber);


        number += 3;
        System.out.println(number);
        number ++;
        System.out.println(number);
        nextNumber -=2;
        System.out.println(nextNumber);
        nextNumber --;
        System.out.println(nextNumber);
    }
}
