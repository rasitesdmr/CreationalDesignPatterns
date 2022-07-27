package threadedLazySingleton;

public class ThreadedLazySingleton {
    private static ThreadedLazySingleton threadedLazySingleton;
    private static int count ;
    private String name;

    private ThreadedLazySingleton(){
        count++;
        name = "ThreadedLazySingleton" + count;
    }
    public static ThreadedLazySingleton getInstance(){
        if (threadedLazySingleton == null){
            threadedLazySingleton = new ThreadedLazySingleton();
        }
        return threadedLazySingleton;
    }
    public void printName(){
        System.out.println(name);
    }

    public ThreadedLazySingleton(String name) {
        this.name = name;
    }
}
