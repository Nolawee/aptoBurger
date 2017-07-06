/**
 * Created by nolaweemengist1 on 7/5/17.
 */


public class Hamburger {
    private String breadRollType;
    private String meat;
    private double price;
    private double condimentPrice;

    private String lettuce;
    private double lettucePrice = 0.25;

    private String tomato;
    private double tomatoPrice = 0.35;

    private String cheese;
    private double cheesePrice = 0.50;

    private String carrot;
    private double carrotPrice = 0.15;




    public Hamburger(String breadRollType, String meat, double price) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public void addLettuce(Boolean lettuce){
        if(lettuce){
            this.lettuce = "lettuce";
            this.condimentPrice += lettucePrice;
        } else {
            System.out.println("Not adding Lettuce");
        }
    }

    public void addTomato(Boolean tomato){
        if(tomato){
            this.tomato = "tomato";
            this.tomatoPrice += tomatoPrice;
        } else {
            System.out.println("Not adding Lettuce");
        }
    }

    public void addCheese(Boolean cheese){
        if(cheese){
            this.cheese = "cheese";
            this.condimentPrice += cheesePrice;
        } else {
            System.out.println("Not adding Cheese");
        }
    }

    public void addCarrot(Boolean carrot){
        if(carrot){
            this.carrot = "carrot";
            this.condimentPrice += carrotPrice;
        } else {
            System.out.println("Not adding Carrot");
        }
    }


    public double orderUpBurger(){
        double totalPrice = this.price;
        System.out.println("Your order is a " + meat + " burger with a "+ this.breadRollType + " bun, " +" with an initial price of $"+ this.price);

        if(this.lettuce != null){
            System.out.println(this.lettuce+" added $"+this.lettucePrice+" to the total price");
        } else if (this.tomato != null){
            System.out.println(this.tomato+" added $"+this.tomatoPrice+" to the total price");
        } else if (this.cheese != null){
            System.out.println(this.cheese+" added $"+this.cheesePrice+" to the total price");
        } else if (this.carrot != null){
            System.out.println(this.carrot+" added $"+this.carrotPrice+" to the total price");
        }

        totalPrice += this.condimentPrice;

        return totalPrice;

    }


}
