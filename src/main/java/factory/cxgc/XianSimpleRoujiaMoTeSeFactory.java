package factory.cxgc;

/**
 * 西安 简单工厂模式:
 * 用来西安店生产自己店里的肉夹馍
 */

public class XianSimpleRoujiaMoTeSeFactory {

    public RoujiaMo creatRoujiaMo(String type) {
        RoujiaMo roujiaMo = null;
        switch (type) {
            case "Suan":
                roujiaMo = new XianSuanRoujiaMo();
                break;
            case "Ku":
//                roujiaMo = new XianKuRoujiMo();
                break;
            case "La":
//                roujiaMo = new XianLaRoujiMo();
                break;
            default:// 默认为酸肉夹馍
                roujiaMo = new XianSuanRoujiaMo();
                break;
        }
        return roujiaMo;
    }
}
