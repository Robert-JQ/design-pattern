package creation.factorymethod;

/**
 * @author jqq
 * @version 1.0
 * @description 壁灯工厂
 * @date 2020/6/8 17:27
 **/
public class WallLightFactory implements ILightFactory {
    @Override
    public ILight createLight() {
        return new WallLight();
    }
}
