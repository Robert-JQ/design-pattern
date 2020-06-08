package creation.factorymethod;

/**
 * @author jqq
 * @version 1.0
 * @description 吊灯工厂
 * @date 2020/6/8 17:26
 **/
public class CeilingLightFactory implements ILightFactory {
    @Override
    public ILight createLight() {
        return new CeilingLight();
    }
}
