package creation.factorymethod;


/**
 * @author jqq
 * @version 1.0
 * @description 台灯
 * @date 2020/6/1 15:00
 **/
public class TableLight implements ILight {
    @Override
    public void switchOn() {
        System.out.println("The TableLight is switch on...");
    }

    @Override
    public void switchOff() {
        System.out.println("The TableLight is switch off...");
    }
}
