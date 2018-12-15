/**
 * Gamepiece allows for the Foot Soldiers and Armored Tanks to function with
 * move, defend, and attack.
 * Creates objects of interfaces DefenseBehavior and AttackBehavior to allow
 * changing of attack and defend styles.
 * @author Chassidy Foreman
 */
public abstract class GamePiece implements Observer {

    int moveSpeed;
    DefenseBehavior defenseBehavior;
    AttackBehavior attackBehavior;

    /**
     * Sets the move speed of a gamepiece.
     * @param moveSpeed
     */
    public void setMoveSpeed(int moveSpeed){
        this.moveSpeed = moveSpeed;
    }

    /**
     * Moves a gamepiece at the speed of move speed.
     */
    public void move(){
        System.out.println("Move " + moveSpeed + " spaces.");
    }

    /**
     * Sets the style of attack.
     * @param attackBehavior the style of attack.
     */
    public void setAttackBehavior(AttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
    }

    /**
     * Sets the style of defense.
     * @param defenseBehavior the style of defense.
     */
    public void setDefenseBehavior(DefenseBehavior defenseBehavior) {
        this.defenseBehavior = defenseBehavior;
    }

    /**
     * Will make the game piece defend.
     */
    public void defend(){
        defenseBehavior.defend();
    }

    /**
     * Will make the game piece attack.
     */
    public void attack(){
        attackBehavior.attack();
    }

    /**
     * Will either attack or defend based on the state of HomeBase.
     * @param underAttack determines whether HomeBase is under attack or not.
     */
    @Override
    public void update(boolean underAttack) {
        if(underAttack){
            defend();
        } else {
            attack();
        }
    }
}
