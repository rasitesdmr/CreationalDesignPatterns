package Soldier.Soldier1;

public class Main {
    public static void main(String[] args) {
        Soldier availableSoldier  = new Soldier(100,80,60.0,
                100,100,8,"bomba",true);

        Soldier notAvailableSoldier = availableSoldier.clone();
        notAvailableSoldier.setAvailableForWar(false);

        availableSoldier.solidInfo();
        notAvailableSoldier.solidInfo();
    }
}
