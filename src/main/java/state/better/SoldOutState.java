package state.better;

/**
 * 售罄的状态
 */

public class SoldOutState implements State {

    private VendingMachineBetter machineBetter;

    public SoldOutState(VendingMachineBetter machineBetter) {
        this.machineBetter = machineBetter;
    }

    @Override
    public void insertMoney() {
        System.out.println("SoldOutState ---投币失败,商品已售罄...");
    }

    @Override
    public void backMoney() {
        System.out.println("SoldOutState ---您未投币,想退钱么?");
    }

    @Override
    public void turnCrank() {
        System.out.println("SoldOutState ---商品售罄，转动手柄也木有用...");
    }

    @Override
    public void dispense() {
        throw new IllegalStateException("非法状态!");
    }
}
