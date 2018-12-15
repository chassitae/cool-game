/**
 * This is a type of GamePiece and will set their attack and defense styles
 * along with move speed.
 * @author Chassidy Foreman
 */

public class FootSoldier extends GamePiece {

    /**
     * Constructor for FootSoldier. Sets the attack and defense behaviors
     * and movespeed.
      */
    public FootSoldier(){
        attackBehavior = new PhaserAttack();
        defenseBehavior = new ShieldDefense();
        setMoveSpeed(2);
    }
}
