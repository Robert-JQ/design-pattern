package creation.singleton.v2_1;

/**
 * @author jqq
 * @version 1.0
 * @description 多线程安全单例
 * @date 2020/6/9 16:35
 **/
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton INSTANCE;

    private ThreadSafeSingleton() {
    }

    /**
     * @author jqq
     * @description 加锁保证线程安全
     * @date 2020/6/9 16:38
     * @return creation.singleton.v2_1.ThreadSafeSingleton
     */
    public static synchronized ThreadSafeSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ThreadSafeSingleton();
        }
        return INSTANCE;
    }
}
