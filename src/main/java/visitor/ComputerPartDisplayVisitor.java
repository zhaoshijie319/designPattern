package visitor;

import visitor.impl.Computer;
import visitor.impl.Keyboard;
import visitor.impl.Monitor;
import visitor.impl.Mouse;

/**
 * 4. 创建实现了 ComputerPartVisitor 的实体访问者。
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("---Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("---Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("---Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("---Displaying Monitor.");
    }
}
