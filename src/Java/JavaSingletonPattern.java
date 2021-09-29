package Java;

public class JavaSingletonPattern {

}

class Singleton {

    public static Singleton instance = new Singleton();
    public String str;
    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}
