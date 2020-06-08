package creation.abstractfactory;

/**
 * @author jqq
 * @version 1.0
 * @description 中国电器工厂
 * @date 2020/6/8 18:22
 **/
public class ChineseElectricalFactory implements IElectricalFactory {
    @Override
    public IFan createFan() {
        return new ChineseFan();
    }

    @Override
    public ITubeLight createTubeLight() {
        return new ChineseTubeLight();
    }
}
