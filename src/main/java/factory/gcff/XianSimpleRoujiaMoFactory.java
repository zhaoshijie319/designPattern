package factory.gcff;


import factory.jdgc.RoujiaMo;

/**
 * 西安 简单工厂模式:
 * 用来西安店生产自己店里的肉夹馍
 */

public class XianSimpleRoujiaMoFactory {

    public RoujiaMo creatRoujiaMo(String type) {
        RoujiaMo roujiaMo = null;
        switch (type) {
            case "Suan":
                roujiaMo = new XianSuanRoujiMo();
                break;
            case "Ku":
                roujiaMo = new XianKuRoujiMo();
                break;
            case "La":
                roujiaMo = new XianLaRoujiMo();
                break;
            default:// 默认为酸肉夹馍
                roujiaMo = new XianSuanRoujiMo();
                break;
        }
        return roujiaMo;
    }
}
