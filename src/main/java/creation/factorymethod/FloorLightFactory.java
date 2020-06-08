package creation.factorymethod;

/**
 * @author jqq
 * @version 1.0
 * @description 落地灯工厂
 * @date 2020/6/8 17:29
 **/
public class FloorLightFactory implements ILightFactory {
    @Override
    public ILight createLight() {
        return new FloorLight();
    }
}
