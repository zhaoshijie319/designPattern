package visitor;

import visitor.impl.Computer;
import visitor.impl.Keyboard;
import visitor.impl.Monitor;
import visitor.impl.Mouse;

/**
 * 3. 定义一个表示访问者的接口。
 */
public interface ComputerPartVisitor {

    public void visit(Computer computer);

    public void visit(Mouse mouse);

    public void visit(Keyboard keyboard);

    public void visit(Monitor monitor);
}
