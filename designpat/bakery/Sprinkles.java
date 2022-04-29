// SE_ASS4_Group5
// Marian Chen - 6258052
// Maja Gójska - 6274446

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
