import java.util.*;

/**
 * Created by nolaweemengist1 on 7/5/17.
 */
public class BillsBurgers {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("White", "Chicken", 5.46);
        hamburger.addCarrot(true);
        hamburger.addCheese(true);
        hamburger.orderUpBurger();
        System.out.println("Total Price of order is: $" + hamburger.orderUpBurger());

        System.out.println("\n ======================================== \n");

        HealthyBurger healthyBurger = new HealthyBurger("Beef", 4.14);
        healthyBurger.addAvocado(true);
        healthyBurger.addLettuce(true);

        System.out.println("Total Price of order is: $" + healthyBurger.orderUpBurger());

        System.out.println("\n ======================================== \n");

        DeluxeBurger deluxeBurger = new DeluxeBurger("Wheat", "Beef",6.20);
        deluxeBurger.addChipsAndDrink();
        System.out.println("Total Price of order is: $" + deluxeBurger.orderUpBurger());


    }

}
