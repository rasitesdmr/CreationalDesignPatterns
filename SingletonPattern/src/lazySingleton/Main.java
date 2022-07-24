package lazySingleton;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <10000 ; i++) {
            LazySingleton lazySingleton = LazySingleton.getInstance();
            lazySingleton.printName();
        }
    }

}
