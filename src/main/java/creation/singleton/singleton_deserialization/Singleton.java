package creation.singleton.singleton_deserialization;

import java.io.Serializable;

/**
 * @author jqq
 * @version 1.0
 * @description
 * @date 2020/6/9 17:24
 **/
public class Singleton implements Serializable {

    private static final long serialVersionUID = -720242824788521048L;

    private static class LazyHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}
