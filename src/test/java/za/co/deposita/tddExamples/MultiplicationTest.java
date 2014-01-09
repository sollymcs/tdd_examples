package za.co.deposita.tddExamples;
import org.junit.*;

/**
 * Created with IntelliJ IDEA.
 * User: Solly
 * Date: 2014/01/06
 * Time: 9:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class MultiplicationTest {
    @Test
    public void multiplicationTest(){
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        Assert.assertEquals(10, product.amount);
        product = five.times(3);
        Assert.assertEquals(15, product.amount);
        product = five.times(5);
        Assert.assertEquals(25, product.amount);
        product = five.times(6);
        Assert.assertEquals(30, product.amount);
    }
}
