package ExerciseMeeting1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRunner {

    @Test
    public void testUserName() {
        User user = new User("Eva", "passWord");

        String expected = "Eva";
        String actual = user.getUserName();

        assertEquals(expected, actual);
    }

    @Test
    public void testPassWord() {
        User user = new User("Adam","Gurka");

        String expected = "Gurka";
        String actual = user.getPassWord();

        assertEquals(expected,actual);
    }

    @Test
    public void testChangeUserName() {
        User user = new User("Adam", "Pannkaka");

        String expected = "Johan";

        user.updateUserName("Johan");
        String actual = user.getUserName();

        assertEquals(expected,actual);
    }

    @Test
    public void testChangeShortUserName() {
        User user = new User("Peter", "Password");

        String expected = "Peter";

        user.updateUserName("Jim");
        String actual = user.getUserName();

        assertEquals(expected,actual);
    }
    @Test
    public void testChangeLongUserName(){
        User user = new User("Peter", "Password");

        String expected = "Peter";

        user.updateUserName("Christoffer");
        String actual = user.getUserName();

        assertEquals(expected,actual);
    }
}