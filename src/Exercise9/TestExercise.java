package Exercise9;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class TestExercise {

    @Test
    public void firstTestCase(){

        String text = "Some Text";
        int actual = text.length();
        int expected = 9;

        assertEquals(expected,actual);
    }

    @Test
    public void testCalc(){
        Calculator calc = new Calculator(3,2);
        int expected = 5;

        int actual = calc.add();

        assertEquals(expected,actual);
    }
}
