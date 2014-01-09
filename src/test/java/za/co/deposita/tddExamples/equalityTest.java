package za.co.deposita.tddExamples;
import org.junit.*;

/**
 * Created with IntelliJ IDEA.
 * User: Solly
 * Date: 2014/01/07
 * Time: 10:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class EqualityTest {
    @Test
    public void equalityTest(){
        Assert.assertTrue(new Dollar(5).equals(new Dollar(5)));
        Assert.assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}