// SE_ASS4_Group5
// Marian Chen - 6258052
// Maja Gójska - 6274446

package designpat.telephone;

import java.util.ArrayList;

/**
 * Prints things out to the screen, when needed
 * Printing to the screen:
 * System.out.println("hello");
 */
public class Screen {

    private ArrayList<Observer> observers;
    private final PhoneModel model;

    public Screen(PhoneModel model) {
        createObservers();
        this.model = model;
    }

    public void createObservers() {

        this.observers = new ArrayList<>();

        this.observers.add(new Observer() {
            @Override
            public void update() {
                int lastDigit = model.getDigits().get(model.getDigits().size() - 1);
                System.out.println(lastDigit);
                // print the last digit
            }
        });

        this.observers.add(new Observer() {
            @Override
            public void update() {
                if(model.isDone()) {
                    String nums = "";
                    for(int i = 0; i < model.getDigits().size(); i++) {
                        nums += model.getDigits().get(i);
                    }
                    System.out.println("Now dialing " + nums);
                }
                // dial the number
            }
        });
    }

    public ArrayList<Observer> getObservers() {
        return this.observers;
    }

}
