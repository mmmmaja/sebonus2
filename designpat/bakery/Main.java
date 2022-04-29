// SE_ASS4_Group5
// Marian Chen - 6258052
// Maja Gójska - 6274446

package designpat.bakery;

/**
 * Create an order and print it
 */
public class Main {
    public static void main(String[] args) {

        // Create the order
        Order order = new Order();
        order.addCake(new ChocolateCake());
        order.addCake(new WithText(new VanillaCake(), "PLAIN!"));
        order.addCake(new WithText(new Sprinkles(new VanillaCake()), "FANCY!"));
        order.addCake(new Multilayered(new WithText(new WithText(new Sprinkles(new Sprinkles(new StrawberryCake())), "One of"), "EVERYTHING")));


        // Print the order
        order.printOrder();
    }
}
