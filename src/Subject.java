/**
 * THis interface will be implemented by HomeBase to add, remove, and notify
 * observers on the state of Homebase.
 * @author Chassidy Foreman
 */

public interface Subject {

    /**
     * Will add an observer to a list of observers.
     * @param o an observer to be added.
     */
    void register(Observer o);

    /**
     * Removes an observer from a list of observers.
     * @param o an observer to be removed.
     */
    void unregister(Observer o);

    /**
     * Notifies observers on the state of HomeBase.
     */
    void notifyObservers();
}
