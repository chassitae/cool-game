/**
 * This is an attack style for the ArmoredTank, and will implement attack behavior.
 * This will allow for other types of attacks to be added in the future.
 * @author Chassidy Foreman
 */

public class CannonAttack implements AttackBehavior {

    /**
     * Overrides the attack method.
     */
    @Override
    public void attack(){
        System.out.println("Attacking with cannon.");
    }
}
