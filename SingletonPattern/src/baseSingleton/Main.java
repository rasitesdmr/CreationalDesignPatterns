package baseSingleton;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <100 ; i++) {
            BaseSingleton baseSingleton  = BaseSingleton.getBaseSingleton();
            baseSingleton.printName();
        }
        BaseSingleton s1 = BaseSingleton.getBaseSingleton();
        System.out.println("\nHashcode: " + s1.hashCode());

        BaseSingleton s2 = BaseSingleton.getBaseSingleton();
        System.out.println("\nHashcode: " + s2.hashCode());

        if (s1 == s2){
            System.out.println("Aynı tür nesneler");
        }else {
            System.out.println("Farklı tür nesneler");
        }
    }
}
