package state.better;

/**
 * 每个状态的实现
 * 没钱的状态
 */

public class NoMoneyState implements State {

    private VendingMachineBetter machineBetter;

    public NoMoneyState(VendingMachineBetter machineBetter) {
        this.machineBetter = machineBetter;
    }

    @Override
    public void insertMoney() {
        System.out.println("NoMoneyState ---投币成功");
        machineBetter.setState(machineBetter.getHasMoneyState());
    }

    @Override
    public void backMoney() {
        System.out.println("NoMoneyState ---您没投币就像退钱? 您这算抢!");
    }

    @Override
    public void turnCrank() {
        System.out.println("NoMoneyState ---您未投币就想摇杆,您在逗我吧!");
    }

    @Override
    public void dispense() {
        System.out.println("NoMoneyState ---这商品要是出了,我跟你姓");
        throw new IllegalStateException("非法状态");
    }
}
