package creation.factorymethod;

/**
 * @author jqq
 * @version 1.0
 * @description 台灯工厂
 * @date 2020/6/8 17:24
 **/
public class TableLightFactory implements ILightFactory {
    @Override
    public ILight createLight() {
        return new TableLight();
    }
}
