package prototype.shapeimpl;


import prototype.Shape;

/**
 * 2. 创建扩展了上面抽象类的实体类。Rectangle 矩形
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("--- Inside Rectangle::draw() method.");
    }


}
