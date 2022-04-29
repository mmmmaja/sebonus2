// SE_ASS4_Group5
// Marian Chen - 6258052
// Maja Gójska - 6274446

package designpat.bakery;

public class WithText extends Decoration {

    private String text = "";

    public WithText(Cake cake, String text) {
        super(cake);
        this.text += text;
    }
    
    public int getCost() {
        return cake.getCost();
    }

    public String getDescription() {
        return cake.getDescription() + " with saying \"" + this.text + "\"";
    }
}
