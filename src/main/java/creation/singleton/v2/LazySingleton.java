package creation.singleton.v2;

/**
 * @author jqq
 * @version 1.0
 * @description 懒汉式单例,延迟初始化
 * @date 2020/6/9 16:28
 **/
public class LazySingleton {

    private static LazySingleton INSTANCE;

    private LazySingleton() {
    }

    /**
     * @author jqq
     * @description 在并发场景下,会产生多个实例,线程不安全
     * @date 2020/6/9 16:34
     * @return creation.singleton.v2.LazySingleton
     */
    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
}
