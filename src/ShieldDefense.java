/**
 * This is another type of defense method implementation.
 * @author Chassidy Foreman
 */

public class ShieldDefense implements DefenseBehavior {

    /**
     * Overrides the defend method.
     */
    @Override
    public void defend() {
        System.out.println("Defending with shield.");
    }
}
