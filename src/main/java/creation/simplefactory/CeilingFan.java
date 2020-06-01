package creation.simplefactory;

/**
 * @author jqq
 * @version 1.0
 * @description 吊扇
 * @date 2020/6/1 15:03
 **/
public class CeilingFan implements IFan{
    @Override
    public void switchOn() {
        System.out.println("The CeilingFan is switch on...");
    }

    @Override
    public void switchOff() {
        System.out.println("The CeilingFan is switch off...");
    }
}
