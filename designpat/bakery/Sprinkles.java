package designpat.bakery;

public class Sprinkles extends Decoration {

    public Sprinkles(Cake cake) {
        super(cake);
    }
    
    public int getCost() {
        return cake.getCost() + 2;
    }

    public String getDescription() {
        return cake.getDescription() + " with sprinkles";
    }
}
