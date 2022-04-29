package designpat.bakery;

public class Multilayered extends Decoration {

    public Multilayered(Cake cake) {
        super(cake);
    }
    
    public int getCost() {
        return cake.getCost() + 5;
    }

    public String getDescription() {
        return "Multi-layered " + cake.getDescription();
    }
}
