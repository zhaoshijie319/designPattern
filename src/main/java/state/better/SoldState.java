package state.better;

/**
 * 售卖状态
 */

public class SoldState implements State {


    private VendingMachineBetter machineBetter;

    public SoldState(VendingMachineBetter machineBetter) {
        this.machineBetter = machineBetter;
    }

    @Override
    public void insertMoney() {
        System.out.println("SoldState ---正在出货,请勿投币");
    }

    @Override
    public void backMoney() {
        System.out.println("SoldState ---正在出货,没有可退的钱");
    }

    @Override
    public void turnCrank() {
        System.out.println("SoldState ---正在出货,请勿重复摇动手柄");
    }

    @Override
    public void dispense() {
        machineBetter.dispense();
        if (machineBetter.getCount() > 0) {
            machineBetter.setState(machineBetter.getNoMoneyState());
        } else {
            System.out.println("SoldState ---商品已经售罄");
            machineBetter.setState(machineBetter.getSoldOutState());
        }
    }
}
