package singleton;

/**
 * 只适用于单线程环境
 */
public class 懒汉式 {
    private 懒汉式() {
    }

    private static 懒汉式 instance = null;

    public static 懒汉式 getInstance() {
        if (instance == null) {
            instance = new 懒汉式();
        }
        return instance;
    }
}
