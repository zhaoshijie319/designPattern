package templatemethod.worker;

import templatemethod.Worker;

/**
 * 一些自由人员
 */

public class OtherWorker extends Worker {

    public OtherWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("--work---" + name + ",打LOL...");
    }
}
