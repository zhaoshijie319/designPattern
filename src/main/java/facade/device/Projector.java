package facade.device;

/**
 * 投影仪
 */

public class Projector {

    public void on() {
        System.out.println("Projector: ---打开投影仪");
    }

    public void off() {
        System.out.println("Projector: ---关闭投影仪");
    }

    public void close() {
        System.out.println("Projector: ---收起投影仪投影区");
    }

    public void open() {
        System.out.println("Projector: ---放下投影仪投影区");
    }
}
