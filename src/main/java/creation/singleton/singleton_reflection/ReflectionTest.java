package creation.singleton.singleton_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author jqq
 * @version 1.0
 * @description 使用反射破坏单例
 * @date 2020/6/9 16:57
 **/
public class ReflectionTest {

    public static void main(String[] args) {
        ReflectionSingleton instanceOne = ReflectionSingleton.getInstance();
        ReflectionSingleton instanceTwo;
        try {
            Constructor<ReflectionSingleton> constructor = ReflectionSingleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            instanceTwo = constructor.newInstance();
            System.out.println(instanceOne.hashCode());
            System.out.println(instanceTwo.hashCode());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}
