/**
 * Type of defense style for a GamePiece.
 * @author Chassidy Foreman
 */

public class ForceFieldDefense implements DefenseBehavior{

    /**
     * Overrides the defend method from the interface DefenseBehavior.
     */
    @Override
    public void defend() {
        System.out.println("Defending with force field.");
    }
}
