/**
 * This will create an Armored tank extended from GamePiece and set defense
 * and attack styles and move speed.
 * @author Chassidy Foreman
 */

public class ArmoredTank extends GamePiece {

    /**
     * Constructor for ArmoredTank. Will set attack and defense behaviors
     * and moveSpeed.
     */
    public ArmoredTank(){
        defenseBehavior = new ForceFieldDefense();
        attackBehavior = new CannonAttack();
        setMoveSpeed(5);
    }
}
