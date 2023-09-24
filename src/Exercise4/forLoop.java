package Exercise4;

public class forLoop {
    public static void main(String[] args) {
        for (int i=1; i<=100; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i =1; i<=100; i++){
            if (i % 2 == 0) {
                System.out.print(i + " är jämntal. ");
            }
        }
        System.out.println();
        int first = 1;
        int second = 1;
        int thired;
        System.out.println("fib: ");
        System.out.print("1 ");
        for (int i = 0; i<=9; i++){
            System.out.print(second + " ");
            thired = first + second;
            first = second;
            second = thired;

        }
    }
}
