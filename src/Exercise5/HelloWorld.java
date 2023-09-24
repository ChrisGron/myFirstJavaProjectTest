package Exercise5;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        int number = Integer.parseInt(scan.nextLine());
        System.out.println(text);
        //System.out.println(number);

        HelloWorldPrinter hwp = new HelloWorldPrinter();

        hwp.print();

        hwp.printMenyTimes(number);
    }
}
