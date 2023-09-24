package Exercise5;

public class MyCar {

    public static void main(String[] args) {

        Car myCar = new Car();

        System.out.println(myCar.getColor());

        myCar.setColor("green");

        String color = myCar.getColor();

        System.out.println(color);

    }
}
