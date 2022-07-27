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

    public static DoubleCheckedLockingSingleton getDoubleCheckedLockingSingleton() {
        return doubleCheckedLockingSingleton;
    }



    public static int getCount() {
        return count;
    }



    public String getName() {
        return name;
    }


}
