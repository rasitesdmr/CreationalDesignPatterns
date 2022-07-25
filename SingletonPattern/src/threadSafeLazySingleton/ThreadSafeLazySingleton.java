package threadSafeLazySingleton;



public class ThreadSafeLazySingleton {

    private static ThreadSafeLazySingleton threadSafeLazySingleton;
    private static int count ;
    private String name;

    private ThreadSafeLazySingleton(){
        count++;
        name = "ThreadedLazySingleton" + count;
    }

    public static ThreadSafeLazySingleton getInstance() {
        synchronized ("ThreadSafeLazySingleton.class") {
            if (threadSafeLazySingleton == null) {
                threadSafeLazySingleton = new ThreadSafeLazySingleton();
            }
            return threadSafeLazySingleton;
        }
    }
    public void printName(){
        System.out.println(name);
    }
}
