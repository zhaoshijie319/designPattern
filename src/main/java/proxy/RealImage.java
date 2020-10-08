package proxy;

/**
 * 2. 创建实现接口的实体类。
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("RealImage loading " + fileName);
    }

    @Override
    public void display() {
        System.out.println("RealImage Displaying " + fileName);
    }
}
