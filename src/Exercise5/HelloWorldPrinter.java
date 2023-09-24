package Exercise5;

public class HelloWorldPrinter {


    public void print () {
        System.out.println("Hello World");
    }

    public void printMenyTimes(int times){
        for (int i = 0; i < times; i++){
            System.out.println("Hello World " + (i+1));
        }
    }
}
