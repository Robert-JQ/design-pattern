package creation.simplefactory;

/**
 * @author jqq
 * @version 1.0
 * @description 简单工厂演示
 * @date 2020/6/1 15:08
 **/
public class SimpleFactoryMain {

    public static void main(String[] args) {
        ILightFactory lightFactory = new LightFactory();
        //使用简单工厂创建吊灯
        ILight light = lightFactory.createLight(LightType.CeilingLight);
        light.switchOn();
        light.switchOff();
    }

}
