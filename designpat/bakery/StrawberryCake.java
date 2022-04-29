package designpat.bakery;

public class StrawberryCake extends Cake {

    @Override
    public String getDescription() {
        return "Strawberry cake";
    }

    public int getCost() {
        return super.getCost() * 2;
    }
    
}
