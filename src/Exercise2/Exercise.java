package Exercise2;

public class Exercise {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 5;

        if (number1 > number2) {
            System.out.println("Number1 is larger than number2");
        } else if (number1 == number2) {
            System.out.println("Number 1 is same as number2");
        } else {
            System.out.println("Number1 is not larger than number2");
        }
        System.out.println("end of text");


        if (number1 % number2 == 0){
            System.out.println("Jämt delbart");

        }else {
            System.out.println("Inte jämt delbart");
        }
    }
}
