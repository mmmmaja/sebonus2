// SE_ASS2_Group5
// Marian Chen - 6258052
// Maja Gójska - 6274446

package designpat.telephone;

public class Main {
    public static void main(String[] args) {
        final int NUM_DIGITS = 10;

        // Build the object graph
        PhoneModel model = new PhoneModel();
        Screen screen = new Screen(model);
        model.addObservers(screen.getObservers());
        KeyPad keyPad = new KeyPad(model);

        // Run the program
        keyPad.simulateKeyPresses(NUM_DIGITS);
    }
}
