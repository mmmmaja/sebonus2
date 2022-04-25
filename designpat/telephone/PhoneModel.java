package designpat.telephone;

import java.util.ArrayList;
import java.util.List;

/**
 * Store a phone number, digit-by-digit
 */
public class PhoneModel {

    private final List<Integer> digits = new ArrayList<>();
    private ArrayList<Observer> observers;
    private boolean done = false;

    public void addDigit(int newDigit) {
        digits.add(newDigit);
    }

    public List<Integer> getDigits() {
        return digits;
    }


    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.notify();
        }
    }

    public void addObservers(ArrayList<Observer> observers) {
        this.observers = observers;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
