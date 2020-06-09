package creation.singleton.v2_2;

/**
 * @author jqq
 * @version 1.0
 * @description 双重检查锁定单例
 * @date 2020/6/9 16:39
 **/
public class DoubleCheckLockingSingleton {

    private static DoubleCheckLockingSingleton INSTANCE;

    private DoubleCheckLockingSingleton() {
    }

    /**
     * @author jqq
     * @description 既保证线程安全,又延迟加锁
     * @date 2020/6/9 16:41
     * @return creation.singleton.v2_2.DoubleCheckLockingSingleton
     */
    public static DoubleCheckLockingSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckLockingSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckLockingSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
