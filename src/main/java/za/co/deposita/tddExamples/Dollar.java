package za.co.deposita.tddExamples;

/**
 * Created with IntelliJ IDEA.
 * User: Solly
 * Date: 2014/01/06
 * Time: 9:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class Dollar {
    int amount;
    Dollar(int amount){
        this.amount = amount;
    }

    Dollar times(int multiplier){
        return new Dollar(amount * multiplier);
    }

    public boolean equals(Object obj){
        Dollar dollar = (Dollar) obj;
        return (amount == dollar.amount);
    }
}
