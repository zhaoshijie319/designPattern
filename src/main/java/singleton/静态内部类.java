package singleton;

/**
 * 只有真正需要的时候才创建对象,利用类内部类和静态变量的特性.
 */
public class 静态内部类 {
    private 静态内部类() {
    }

    public static 静态内部类 getInstance() {
        return InnerSingleton.singleton;
    }

    static class InnerSingleton {
        private InnerSingleton() {
        }

        static 静态内部类 singleton = new 静态内部类();
    }
}
