/**
 * Created by nolaweemengist1 on 7/5/17.
 */
import java.util.HashMap;
import java.util.Map;

public class Hamburger {
    private String breadRollType;
    private String meat;
    private double price;
    private boolean itemsAdded = false;



    public Hamburger(String breadRollType, String meat, double price) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }


    public void orderUpBurger(){
        double totalPrice = this.price;
        System.out.println("Your order is a " + meat + " burger with a "+ this.breadRollType + " bun, " +" with an initial price of "+ this.price);

    }


}
