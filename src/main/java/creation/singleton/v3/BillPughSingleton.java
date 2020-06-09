package creation.singleton.v3;

/**
 * @author jqq
 * @version 1.0
 * @description 比尔-普夫单例
 * @date 2020/6/9 16:43
 **/
public class BillPughSingleton {

    private BillPughSingleton() {
    }

    /**
     * 通过静态内部类,既可以延迟加载,又能保证线程安全
     */
    private static class LazyHolder {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}
