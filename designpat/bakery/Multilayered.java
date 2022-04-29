// SE_ASS4_Group5
// Marian Chen - 6258052
// Maja Gójska - 6274446

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
