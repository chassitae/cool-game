/**
 * Type of AttackBehavior for the GamePiece.
 * @author Chassidy Foreman
 */

public class PhaserAttack implements AttackBehavior {

    /**
     * Overrides the attack method.
     */
    @Override
    public void attack() {
        System.out.println("Attacking with phaser.");
    }
}
