package Soldier.Soldier3;

public class SoldierFactory implements Factory{

    // Soldier availableSoldier();
    private static final Soldier availableSoldier = new Soldier(100, 80, 60.0,
            100, 100, 8, "bomba", true);
    // Soldier notAvailableSoldier();
    private static final Soldier notAvailableSoldier =new Soldier(1,100,80,
            60,100,5,"kılıç",false);
    // Soldier createMorePowerfulSoldier(int power);
    private static final Soldier createMorePowerfulSoldier = new Soldier(1,100,60,60,
            150,5,"kılıç",true);


    @Override
    public Soldier availableSoldier() {
        return availableSoldier.clone();
    }

    @Override
    public Soldier notAvailableSoldier() {
        return notAvailableSoldier.clone();
    }

    @Override
    public Soldier createMorePowerfulSoldier() {
        return createMorePowerfulSoldier.clone();
    }
}
