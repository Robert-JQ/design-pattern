package creation.simplefactory;

/**
 * @author jqq
 * @version 1.0
 * @description
 * @date 2020/6/1 15:06
 **/
public class LightFactory implements ILightFactory {
    @Override
    public ILight createLight(LightType type) {
        switch (type) {
            case TableLight:
                return new TableLight();
            case CeilingLight:
                return new CeilingLight();
            case WallLight:
                return new WallLight();
            default:
                return new TableLight();
        }
    }
}
