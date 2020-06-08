package creation.simplefactory;

/**
 * @author jqq
 * @version 1.0
 * @description 吊灯
 * @date 2020/6/1 15:03
 **/
public class CeilingLight implements ILight {
    @Override
    public void switchOn() {
        System.out.println("The CeilingLight is switch on...");
    }

    @Override
    public void switchOff() {
        System.out.println("The CeilingLight is switch off...");
    }
}
