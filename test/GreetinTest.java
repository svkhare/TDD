import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GreetinTest {

    private Greeting greeting;
    @Before
    public void setup(){
         greeting = new Greeting();
    }

    @Test
    public void greetShouldReturnAValidOutput(){
        String result = greeting.greet("JUnit");
        assertNotNull(result);
        assertEquals("Hello JUnit",result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void greetShouldThrowAnExceptionIfNameIsNull(){
        greeting.greet(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void greetShouldThrowAnExceptionIfNameIsBlank(){
        greeting.greet("");
    }

    @After
    public void teardown(){
        greeting= null;
    }
}
