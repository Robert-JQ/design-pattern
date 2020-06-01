package creation.simplefactory;

/**
 * @author jqq
 * @version 1.0
 * @description 排风扇
 * @date 2020/6/1 15:04
 **/
public class ExhaustFan implements IFan {
    @Override
    public void switchOn() {
        System.out.println("The ExhaustFan is switch on...");
    }

    @Override
    public void switchOff() {
        System.out.println("The ExhaustFan is switch on...");
    }
}
