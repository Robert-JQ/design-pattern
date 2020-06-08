package creation.abstractfactory;

/**
 * @author jqq
 * @version 1.0
 * @description 美国电器工厂
 * @date 2020/6/8 18:26
 **/
public class USElectricalFactory implements IElectricalFactory {
    @Override
    public IFan createFan() {
        return new USFan();
    }

    @Override
    public ITubeLight createTubeLight() {
        return new USTubeLight();
    }
}
