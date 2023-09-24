import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Skift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Skift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
        int b = 13;
        System.out.println("The square is:" + b*b);

        int base = 8000;//base salery
        float percentage = 9.0f;
        Scanner inputNumScanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter sum");
        int saleSum = inputNumScanner.nextInt();  // Read user input

        int salary = (int)(saleSum *(percentage/100.0f));
        salary = salary + base;
        System.out.println("Salery is: " + salary);  // Output user salary
    }
}