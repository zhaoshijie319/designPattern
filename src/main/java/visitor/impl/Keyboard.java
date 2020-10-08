package visitor.impl;

import visitor.ComputerPart;
import visitor.ComputerPartVisitor;

/**
 * 2. 创建扩展了上述类的实体类。
 */
public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
