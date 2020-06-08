package creation.abstractfactory;

/**
 * @author jqq
 * @version 1.0
 * @description 中国电扇
 * @date 2020/6/8 18:19
 **/
public class ChineseFan implements IFan {
    @Override
    public void switchOn() {
        System.out.println("The ChineseFan is switched on...");
    }

    @Override
    public void switchOff() {
        System.out.println("The ChineseFan is switched off...");
    }
}
