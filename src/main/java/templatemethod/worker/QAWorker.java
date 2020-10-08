package templatemethod.worker;

import templatemethod.Worker;

/**
 * 测试人员
 */

public class QAWorker extends Worker {

    public QAWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("--work---" + name + ", 写测试用例 - 提交Bug - 复查Bug");
    }
}
