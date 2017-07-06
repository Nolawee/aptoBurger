/**
 * Created by nolaweemengist1 on 7/5/17.
 */

public class DeluxeBurger extends Hamburger {
    private String chips = "Chips";
    private double chipsPrice = 1.75;

    private double condimentPrice;

    private String drink = "Drink";
    private double drinkPrice = 1.08;


    public DeluxeBurger(String breadRollType, String meat, double price) {
        super(breadRollType, meat, price);
    }

    public void addChipsAndDrink(){
        double chipAndDrinkPrice = this.chipsPrice + this.drinkPrice;
        condimentPrice += chipAndDrinkPrice;
    }

    @Override
    public double orderUpBurger() {
        double totalPrice = super.orderUpBurger();


        System.out.println("chips and drink add $"+this.condimentPrice+" to the total price");


        totalPrice += this.condimentPrice;

        double roundOff = (double) Math.round(totalPrice * 100) / 100;

        return roundOff;
    }

    @Override
    public void addLettuce(Boolean lettuce) {
        System.out.println("Can't add lettuce");
    }

    @Override
    public void addTomato(Boolean tomato) {
        System.out.println("Can't add tomato");
    }

    @Override
    public void addCheese(Boolean cheese) {
        System.out.println("Can't add cheese");
    }

    @Override
    public void addCarrot(Boolean carrot) {
        System.out.println("Can't add carrot");
    }
}
