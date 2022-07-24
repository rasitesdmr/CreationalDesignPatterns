package threadedLazySingleton;

public class Main extends Thread{

    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            new Main().start();
        }
    }

    public void run(){
        ThreadedLazySingleton threadedLazySingleton = ThreadedLazySingleton.getInstance();
        threadedLazySingleton.printName();
    }

}
