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
                // print the last digit
            }

            @Override
            public ObserverType getObserverType() {
                return ObserverType.digitPrinter;
            }
        });

        this.observers.add(new Observer() {
            @Override
            public void update() {
                // dial the number
            }

            @Override
            public ObserverType getObserverType() {
                return ObserverType.dialer;
            }
        });

    }

}
