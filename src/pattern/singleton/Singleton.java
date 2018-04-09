package pattern.singleton;

/**
 * @author Yue Lin
 * @since 2018-04-08
 */
public class Singleton {
    private static Singleton Instance = new Singleton();
    private Singleton() {}
    public static Singleton getSingleton() {
        return Instance;
    }
}

enum SingletonEnum {
    INSTANCE;
    void fun () {

    }
}
