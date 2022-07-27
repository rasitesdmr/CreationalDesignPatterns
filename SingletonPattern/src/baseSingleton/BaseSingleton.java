package baseSingleton;

public class BaseSingleton {
  private static BaseSingleton baseSingleton = new BaseSingleton();

  private static int count;
  private String name;

    public BaseSingleton() {
        count++;
        name = "Singleton" + count;
    }

    public static BaseSingleton getBaseSingleton() {
        return baseSingleton;
    }
    public void printName(){
        System.out.println(name);
    }

    public BaseSingleton(String name) {
        this.name = name;
    }
}
