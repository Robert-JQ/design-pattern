package creation.factorymethod;

/**
 * @author jqq
 * @version 1.0
 * @description 落地灯
 * @date 2020/6/8 17:28
 **/
public class FloorLight implements ILight {
    @Override
    public void switchOn() {
        System.out.println("The FloorLight is switch on...");
    }

    @Override
    public void switchOff() {
        System.out.println("The FloorLight is switch off...");
    }
}
