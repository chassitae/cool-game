/**
 * MainApp creates the game and initializes a HomeBase and Gamepieces.
 * Calls methods and registers observers
 * @author Chassidy Foreman
 */

public class MainApp {

    public static void main(String[] args) {

        HomeBase homeBase = new HomeBase();

        GamePiece chip = new FootSoldier();
        GamePiece ted = new FootSoldier();
        GamePiece tankAlpha = new ArmoredTank();

        homeBase.register(chip);
        homeBase.register(ted);
        homeBase.register(tankAlpha);

        chip.attack();
        ted.attack();
        tankAlpha.attack();

        System.out.println("");
        homeBase.setUnderAttack(true);

        chip.setAttackBehavior(new PlasmaRifleAttack());

        System.out.println("");
        chip.move();
        tankAlpha.move();

        System.out.println("");
        homeBase.setUnderAttack(false);

        System.out.println("");
        homeBase.setUnderAttack(true);
    }
}