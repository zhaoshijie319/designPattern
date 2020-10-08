package adapter;

/**
 * 适配器模式:
 * 定义：将一个类的接口转换成客户期望的另一个接口，适配器让原本接口不兼容的类可以相互合作。
 * 这个定义还好，说适配器的功能就是把一个接口转成另一个接口。
 * 如题目，手机充电器一般都是5V左右吧，咱天朝的家用交流电压220V，所以手机充电需要一个适配器（降压器）
 */
public class AdapterActivity {
    public static void main(String[] args) {

        V220Power v220Power = new V220Power();
        V5PowerAdapter v5PowerAdapter = new V5PowerAdapter(v220Power);
        Mobile mobile = new Mobile();
        mobile.inputPower(v5PowerAdapter);
    }
}
