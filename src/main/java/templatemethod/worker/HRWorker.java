package templatemethod.worker;

import templatemethod.Worker;

/**
 * HR
 */

public class HRWorker extends Worker {

    public HRWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("--work---" + name + ", 看简历 - 打电话 - 接电话");
    }
}
