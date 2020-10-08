package factory;

import factory.jdgc.RoujiaMoStore;
import factory.jdgc.SimpleRoujiaMoFactory;

/**
 * <p>
 * 今天继续设计模式之旅，给大家带来工厂模式，简单列一下这个模式的家族：
 * 1、静态工厂模式
 * 2、简单工厂模式
 * 3、工厂方法模式
 * 4、抽象工厂模式
 * <p>
 * <p>
 * 1、静态工厂模式
 * 这个最常见了，项目中的辅助类，TextUtil.isEmpty等，类+静态方法。下面开始详细介绍：略
 */
public class FactoryActivity {
    public static void main(String[] args) {
        RoujiaMoStore roujiaMoStore = new RoujiaMoStore(new SimpleRoujiaMoFactory());
        roujiaMoStore.sellRoujiaMo("Suan");
        roujiaMoStore.sellRoujiaMo("Tian");
        roujiaMoStore.sellRoujiaMo("La");

    }
}
