package Exercise3;

public class Exercise {
    public static void main(String[] args) {
        int number = 1;
        while (number <= 100) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        number = 1;
        while (number <= 100) {
            if (number % 2 == 0) {
                System.out.print(number + " är jämntal. ");
            }
            number++;
        }

        number = 1;
        int pastnumber = 1;
        int nextNumber;
        System.out.println("fib: ");
        System.out.println(number);
        while (pastnumber <= 100){
            System.out.println(pastnumber);
            nextNumber = number + pastnumber;
            number = pastnumber;
            pastnumber = nextNumber;


        }
    }
}
