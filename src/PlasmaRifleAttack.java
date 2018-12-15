/**
 * Another type of attack method as an update for the FootSoldier to allow
 * for easy changing of attack method or defense methods in the future.
 * @author Chassidy Foreman
 */

public class PlasmaRifleAttack implements AttackBehavior {

    /**
     * This will override the attack method.
     */
    @Override
    public void attack(){
        System.out.println("Attack with plasma rifle.");
    }
}