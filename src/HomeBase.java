/**
 * HomeBase will create the base of whether or not the Gamepieces will attack
 * or defend.
 * Notifies observers as to when the HomeBase is under attack or not.
 * @author Chassidy Foreman
 */

import java.util.ArrayList;

public class HomeBase implements Subject {

    private ArrayList<Observer> observers = new ArrayList<>();
    private boolean underAttack = false;

    /**
     * Determines whether Homebase is under attack
     * @return true or false
     */
    public boolean isUnderAttack(){
        return underAttack;
    }

    /**
     * Changes the state of HomeBase
     * @param underAttack is either true or false
     */
    public void setUnderAttack(boolean underAttack) {
        this.underAttack = underAttack;
        notifyObservers();
    }

    /**
     * Notifies observers and updates them as to when the state of HomeBase
     * changes.
     */
    @Override
    public void notifyObservers() {
        for(int i = 0; i < observers.size(); i++){
            Observer observer = observers.get(i);
            observer.update(underAttack);
        }
    }

    /**
     * Adds am observer to the list of observers.
     * @param o an observer to be added.
     */
    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    /**
     * Deletes an observer from the list of observers.
     * @param o observer to be removed.
     */
    @Override
    public void unregister(Observer o) {

    }
}
