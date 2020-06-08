package creation.abstractfactory;

/**
 * @author jqq
 * @version 1.0
 * @description 美国日光灯
 * @date 2020/6/8 18:24
 **/
public class USTubeLight implements ITubeLight {
    @Override
    public void switchOn() {
        System.out.println("The USTubeLight is switched on...");
    }

    @Override
    public void switchOff() {
        System.out.println("The USTubeLight is switched off...");
    }

    @Override
    public void tuneLight() {
        System.out.println("The USTubeLight is tuned...");
    }
}
