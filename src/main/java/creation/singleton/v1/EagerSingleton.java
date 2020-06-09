package creation.singleton.v1;

/**
 * @author jqq
 * @version 1.0
 * @description 饿汉式单例,空间换时间
 * @date 2020/6/9 16:19
 **/
public class EagerSingleton {

    private static final EagerSingleton INSTANCE = new EagerSingleton();

    /**
     * 构造器私有，避免被客户端初始化
     */
    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
