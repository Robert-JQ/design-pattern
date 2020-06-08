package creation.abstractfactory;

/**
 * @author jqq
 * @version 1.0
 * @description 抽象工厂
 * @date 2020/6/8 18:26
 **/
public class AbstractFactoryMain {

    public static void main(String[] args) {
        IElectricalFactory electricalFactory = new ChineseElectricalFactory();
        IFan fan = electricalFactory.createFan();
        fan.switchOn();
        fan.switchOff();

        electricalFactory = new USElectricalFactory();
        ITubeLight tubeLight = electricalFactory.createTubeLight();
        tubeLight.switchOn();
        tubeLight.switchOff();
        tubeLight.tuneLight();
    }

}
