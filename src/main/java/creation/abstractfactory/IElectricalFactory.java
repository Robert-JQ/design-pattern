package creation.abstractfactory;

/**
 * @author jqq
 * @version 1.0
 * @description 电器工厂
 * @date 2020/6/8 18:16
 **/
public interface IElectricalFactory {

    IFan createFan();

    ITubeLight createTubeLight();

}
