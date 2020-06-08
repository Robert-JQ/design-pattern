package creation.factorymethod;


/**
 * @author jqq
 * @version 1.0
 * @description 壁灯
 * @date 2020/6/1 15:04
 **/
public class WallLight implements ILight {
    @Override
    public void switchOn() {
        System.out.println("The WallLight is switch on...");
    }

    @Override
    public void switchOff() {
        System.out.println("The WallLight is switch on...");
    }
}
