// SE_ASS4_Group5
// Marian Chen - 6258052
// Maja Gójska - 6274446

package designpat.telephone;

import java.util.Random;

/**
 * Mimic the data input ability of a physical phone's keypad;
 * however, here we're just sending it fake digits.
 */
public class KeyPad {

    private final PhoneModel model;

    public KeyPad(PhoneModel model) {
        this.model = model;
    }

    public void simulateKeyPresses(int numKeyPresses) {

        final int MAX_DIGIT = 10;
        Random rnd = new Random();
        for (int i = 0; i < numKeyPresses; i++) {
            if (i == numKeyPresses - 1) {
                model.setDone(true);
            }
            int newDigit = rnd.nextInt(MAX_DIGIT);
            System.out.println("Pressing: " + newDigit);
            model.addDigit(newDigit);
            model.notifyObservers();
        }
    }

}
