package creation.factorymethod;

/**
 * @author jqq
 * @version 1.0
 * @description 工厂方法
 * @date 2020/6/8 17:34
 **/
public class FactoryMethodMain {

    public static void main(String[] args) {
        ILightFactory lightFactory = new FloorLightFactory();
        ILight floorLight = lightFactory.createLight();
        floorLight.switchOn();
        floorLight.switchOff();
    }

}
