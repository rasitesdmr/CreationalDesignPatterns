package Soldier.Soldier3;

public class Main {
    public static void main(String[] args) {

        SoldierFactory soldierFactory = new SoldierFactory();

        Soldier availableSoldier = soldierFactory.availableSoldier();
        availableSoldier.solidInfo();

        Soldier notAvailableSoldier = soldierFactory.notAvailableSoldier();
        notAvailableSoldier.solidInfo();

        Soldier createMorePowerfulSoldier = soldierFactory.createMorePowerfulSoldier();
        createMorePowerfulSoldier.solidInfo();
    }
}
