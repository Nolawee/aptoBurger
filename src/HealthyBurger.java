/**
 * Created by nolaweemengist1 on 7/5/17.
 */
public class HealthyBurger extends Hamburger{

    private String kale;
    private double kalePrice = 2.03;

    private double condimentPrice;

    private String avocado;
    private double avocadoPrice = 1.58;

    public HealthyBurger(String meat, double price){
        super("Brown Rye", meat, price);
    }

    public void addKale(Boolean kale){
        if(kale){
            this.kale = "kale";
            this.condimentPrice += kalePrice;
        } else {
            System.out.println("Not adding Kale");
        }
    }

    public void addAvocado(Boolean avocado){
        if(avocado){
            this.avocado = "avocado";
            this.condimentPrice += avocadoPrice;
        } else {
            System.out.println("Not adding avocado");
        }
    }

    @Override
    public double orderUpBurger() {
        double totalPrice = super.orderUpBurger();

        if(this.kale != null){
            System.out.println(this.kale+" added $"+this.kale+" to the total price");
        } else if (this.avocado != null){
            System.out.println(this.avocado+" added $"+this.avocadoPrice+" to the total price");
        }

        totalPrice += this.condimentPrice;

        return totalPrice;
    }
}
