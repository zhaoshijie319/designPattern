package factory.cxgc;


/**
 * 西安肉夹馍店   让分店自己去卖自己口味的肉夹馍
 */

public class XianRoujiaMoTeSeStore extends RoujiaMoStore {

    private XianSimpleRoujiaMoTeSeFactory factory;

    public XianRoujiaMoTeSeStore(XianSimpleRoujiaMoTeSeFactory factory) {
        this.factory = factory;
    }

    public RoujiaMo sellRoujiaMo(String type) {

        RoujiaMo roujiaMo = factory.creatRoujiaMo(type);
        roujiaMo.prepare(new XianRoujiaMoYLFoctory());
        roujiaMo.fire();
        roujiaMo.pack();
        return roujiaMo;
    }
}
