package Exercise10;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
public class PasswordCheck {

    @Test
    public void testPassword(){

        TestPassword test = new TestPassword();
        boolean expected = true;

        boolean actual = test.check("pass-word1");

        assertEquals(expected,actual);

    }
    @Test
    public void testPassLengt(){

        TestPassword test = new TestPassword();
        boolean expected = false;

        boolean actual = test.check("pass1");

        assertEquals(expected,actual);

    }
    @Test
    public void testNoDigit(){

        TestPassword test = new TestPassword();
        boolean expected = false;

        boolean actual = test.check("pas/sword");

        assertEquals(expected,actual);

    }
    @Test
    public void testDigit(){

        TestPassword test = new TestPassword();
        boolean expected = true;

        boolean actual = test.check("passw¤ord1");

        assertEquals(expected,actual);

    }
    @Test
    public void TestNoSpecialChar(){

        TestPassword test = new TestPassword();
        boolean expected = false;

        boolean actual = test.check("passwo6rd");

        assertEquals(expected,actual);

    }
}
