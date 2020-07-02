import org.junit.Assert;
import org.junit.Test;

public class RemoteTddTest {

    @Test
    public void checkCapital(){
        RemoteTdd helper= new RemoteTdd();
        Assert.assertEquals("Doesn't have a capital letter", helper.checkIfCapital("Sayali"));
    }

    @Test
    public void checkNumber(){
        RemoteTdd helper= new RemoteTdd();
        Assert.assertEquals("Doesn't have a number", helper.checkIfNumber("Sayali2"));
    }

    @Test
    public void checkLengthLessThanFour(){
        RemoteTdd helper= new RemoteTdd();
        Assert.assertEquals("Length is less than four", helper.checkLength("Say"));
    }

    @Test
    public void checkLengthGreaterThanEight(){
        RemoteTdd helper= new RemoteTdd();
        Assert.assertEquals("Length is greater than eight", helper.checkLength("SayaliKhare"));
    }

    @Test
    public void checkIfRegex(){
        RemoteTdd helper= new RemoteTdd();
        Assert.assertEquals("Contains Regular Expression", helper.checkReGex("sayali12"));
    }
}
