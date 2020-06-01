package creation.simplefactory;

/**
 * @author jqq
 * @version 1.0
 * @description 简单工厂演示
 * @date 2020/6/1 15:08
 **/
public class SimpleFactoryMain {

    public static void main(String[] args) {
        IFanFactory fanFactory = new FanFactory();
        //使用简单工厂创建吊扇
        IFan fan = fanFactory.createFan(FanType.CeilingFan);
        fan.switchOn();
        fan.switchOff();
    }

}
