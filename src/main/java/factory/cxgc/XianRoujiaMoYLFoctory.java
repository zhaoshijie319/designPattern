package factory.cxgc;

/**
 * 西安的肉夹馍原料工厂,是西安的特色原料,还有其他分店的特色原料
 */

public class XianRoujiaMoYLFoctory implements RoujiaMoYLFactory {

    @Override
    public Meat creatMeet() {
        return new XianFreshMeat();
    }

    @Override
    public YuanLiao creatYuanLiao() {
        return new XianTeSeYuanLiao();
    }
}
