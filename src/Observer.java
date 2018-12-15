/**
 * This interface will be implemented by GamePiece as to when the HomeBase
 * state has changed.
 * @author Chassidy Foreman
 */

public interface Observer {

    /**
     * This will update and call methods attack or defend depending on the
     * state of HomeBase
     * @param underAttack the state of HomeBase.
     */
    void update(boolean underAttack);
}
