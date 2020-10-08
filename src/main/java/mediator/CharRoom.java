package mediator;

import java.util.Date;

/**
 * 1. 创建中介类。
 */
public class CharRoom {
    public static void showMessage(User user, String message) {
        System.out.println("---" + new Date().toString()
                + " [" + user.getName() + "] : " + message);
    }
}
