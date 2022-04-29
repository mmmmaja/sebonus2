// SE_ASS2_Group5
// Marian Chen - 6258052
// Maja Gójska - 6274446

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
