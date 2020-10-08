package prototype.shapeimpl;


import prototype.Shape;

/**
 * 2. 创建扩展了上面抽象类的实体类。Circle 圆形
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("--- Inside Circle::draw() method.");
    }

}
