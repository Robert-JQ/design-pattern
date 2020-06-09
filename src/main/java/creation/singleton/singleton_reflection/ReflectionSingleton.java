package creation.singleton.singleton_reflection;

/**
 * @author jqq
 * @version 1.0
 * @description
 * @date 2020/6/9 16:52
 **/
public class ReflectionSingleton {

    private static ReflectionSingleton INSTANCE;

    private ReflectionSingleton() {
    }

    public static synchronized ReflectionSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ReflectionSingleton();
        }
        return INSTANCE;
    }
}
