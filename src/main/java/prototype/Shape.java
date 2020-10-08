package prototype;

import lombok.Data;

/**
 * 1. 创建一个实现了 Cloneable 接口的抽象类。
 */
@Data
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    public abstract void draw();

    @Override
    public Object clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("--" + e.getMessage());
        }
        return object;
    }
}
