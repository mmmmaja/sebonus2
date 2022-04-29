// SE_ASS4_Group5
// Marian Chen - 6258052
// Maja Gójska - 6274446

package designpat.bakery;

import java.util.ArrayList;
import java.util.List;

/**
 * Store a collection of cakes being ordered by a customer
 */
public class Order {
    private final List<Cake> cakes = new ArrayList<>();

    public void addCake(Cake cake) {
        cakes.add(cake);
    }

    public void printOrder() {
        for (Cake cake : cakes) {
            System.out.printf("   %2d  %s\n", cake.getCost(), cake.getDescription());
        }
    }
}
