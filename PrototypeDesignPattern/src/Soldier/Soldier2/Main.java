package Soldier.Soldier2;

public class Main {
    public static void main(String[] args) {
        Factory factory = new SoldierFactory();

        Soldier availableSoldier = factory.availableSoldier();
        availableSoldier.solidInfo();
        Soldier notAvailableSoldier =factory.notAvailableSoldier();
        notAvailableSoldier.solidInfo();
    }
}
