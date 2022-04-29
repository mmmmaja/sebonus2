package designpat.bakery;

public abstract class Decoration extends Cake {

    protected Cake cake;

    public Decoration(Cake cake) {
        this.cake = cake;
    }

    public int getCost() {
        return cake.getCost();
    }

    public String getDescription() {
        return cake.getDescription();
    }
}
