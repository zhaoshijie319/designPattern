package builder;

import lombok.Data;

/**
 * 产品类
 */
@Data
public class Product {

    private String name;
    private String type;

    public void showProduct() {
        System.out.println("名称：" + name);
        System.out.println("型号：" + type);
    }
}
