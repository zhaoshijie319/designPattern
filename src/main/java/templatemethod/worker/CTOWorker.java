package templatemethod.worker;

import templatemethod.Worker;

/**
 * CTO
 */

public class CTOWorker extends Worker {

    public CTOWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("--work---" + name + ", 开会 - 出API - 检查进度");
    }
}
