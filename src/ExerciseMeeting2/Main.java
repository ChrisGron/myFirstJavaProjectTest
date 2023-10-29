package ExerciseMeeting2;

public class Main {
    public static void main(String[] args) {
        Methods methods = new Methods();

        String[] testArray = {"1","9","8","5","0","8","2","6","-","7","8","7","5"};
        String[] testArrayTwo = {"19850826-7875"};

        System.out.println(methods.personalNumberCheck(testArrayTwo));

        System.out.println(methods.oddOrEven(testArray));
        methods.checkOddEven(testArrayTwo);

    }
}
