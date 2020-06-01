package creation.simplefactory;

/**
 * @author jqq
 * @version 1.0
 * @description 台扇
 * @date 2020/6/1 15:00
 **/
public class TableFan implements IFan {
    @Override
    public void switchOn() {
        System.out.println("The TableFan is switch on...");
    }

    @Override
    public void switchOff() {
        System.out.println("The TableFan is switch off...");
    }
}
