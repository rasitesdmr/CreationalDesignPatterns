package doubleCheckedLockingSingleton;

public class Main extends Thread{

    public static void main(String[] args) {
        for (int i = 0; i <1000 ; i++) {
            new Main().start();
        }
    }
    public void run(){
        DoubleCheckedLockingSingleton doubleCheckedLockingSingleton = DoubleCheckedLockingSingleton.getInstance();
        doubleCheckedLockingSingleton.printName();
    }
}
