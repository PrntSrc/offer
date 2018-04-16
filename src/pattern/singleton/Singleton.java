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

class SingletonDoubleCheck {
    private volatile static SingletonDoubleCheck Instance;
    private SingletonDoubleCheck() {}
    public static SingletonDoubleCheck getInstance() {
        if (Instance == null) {
            synchronized (SingletonDoubleCheck.class) {
                if (Instance == null) {
                    Instance = new SingletonDoubleCheck();
                }
            }
        }
        return Instance;
    }
}

enum SingletonEnum {
    INSTANCE;
    void fun () {

    }
}
