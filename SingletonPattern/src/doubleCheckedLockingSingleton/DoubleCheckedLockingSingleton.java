package doubleCheckedLockingSingleton;

public class DoubleCheckedLockingSingleton {

    private static volatile DoubleCheckedLockingSingleton doubleCheckedLockingSingleton;

    private static int count;
    private String name;

    private DoubleCheckedLockingSingleton() {
        count++;
        name = "DoubleCheckedLockingSingleton" + count;
    }

    public static DoubleCheckedLockingSingleton getInstance() {
        if (doubleCheckedLockingSingleton == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (doubleCheckedLockingSingleton == null) {
                    doubleCheckedLockingSingleton = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return doubleCheckedLockingSingleton;
    }
    public void printName(){
        System.out.println(name);
    }

}
