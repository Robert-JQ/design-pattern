package creation.abstractfactory;

/**
 * @author jqq
 * @version 1.0
 * @description 美国电扇
 * @date 2020/6/8 18:23
 **/
public class USFan implements IFan {
    @Override
    public void switchOn() {
        System.out.println("The USFan is switched on...");
    }

    @Override
    public void switchOff() {
        System.out.println("The USFan is switched off...");
    }
}
