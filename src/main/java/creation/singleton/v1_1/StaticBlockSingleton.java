package creation.singleton.v1_1;

/**
 * @author jqq
 * @version 1.0
 * @description 静态块初始化单例
 * @date 2020/6/9 16:24
 **/
public class StaticBlockSingleton {

    private static final StaticBlockSingleton INSTANCE;

    /**
     * 私有化构造器
     */
    private StaticBlockSingleton() {
    }

    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("create instance exception", e);
        }
    }

    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }
}
