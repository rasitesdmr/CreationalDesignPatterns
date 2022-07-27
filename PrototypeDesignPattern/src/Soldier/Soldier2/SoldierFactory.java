package Soldier.Soldier2;

public class SoldierFactory implements Factory {

    private static  Soldier availableSoldier = new Soldier(100, 80, 60.0,
            100, 100, 8, "bomba", true);

    @Override
    public Soldier availableSoldier() {
        return availableSoldier;
    }

    @Override
    public Soldier notAvailableSoldier() {
      Soldier notAvailableSoldier = availableSoldier.clone();
        notAvailableSoldier.setAvailableForWar(false);
        return notAvailableSoldier;
    }
}
