package chainofresponsibility.impl;


import chainofresponsibility.AbstractLogger;

/**
 * 2. 创建扩展了该记录器类的实体类。
 */
public class InfoLogger extends AbstractLogger {

    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Info Console::Logger  " + message);
    }
}
