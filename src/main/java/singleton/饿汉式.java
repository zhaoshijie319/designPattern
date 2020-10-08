package singleton;

/**
 * 在初始化静态变量时,就创建单例对象.但是,会过早的创建对象.
 */
public class 饿汉式 {
    private 饿汉式() {
    }

    private static 饿汉式 instance = new 饿汉式();

    public static 饿汉式 getInstance() {
        return instance;
    }
}
