package singleton;

/**
 * 加锁保证多线程情况下只创建一个实例,并且用两个if来提高效率.但是代码比较复杂,容易出错.
 */
public class 双重校验锁 {
    private 双重校验锁() {
    }

    private static volatile 双重校验锁 instance = null;

    public static 双重校验锁 getInstance() {
        if (instance == null) {
            synchronized (双重校验锁.class) {
                if (instance == null) {
                    instance = new 双重校验锁();
                }
            }
        }
        return instance;
    }
}
