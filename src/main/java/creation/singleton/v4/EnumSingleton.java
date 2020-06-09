package creation.singleton.v4;

/**
 * @author jqq
 * @version 1.0
 * @description 枚举单例
 * @date 2020/6/9 16:48
 **/
public enum EnumSingleton {

    /**
     * 实例
     */
    INSTANCE;

    public void method() {
        System.out.println("Singleton method called...");
    }

    public static void main(String[] args) {
        EnumSingleton.INSTANCE.method();
    }
}
