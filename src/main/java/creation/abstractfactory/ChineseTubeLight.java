package creation.abstractfactory;

/**
 * @author jqq
 * @version 1.0
 * @description 中国日光灯
 * @date 2020/6/8 18:20
 **/
public class ChineseTubeLight implements ITubeLight {
    @Override
    public void switchOn() {
        System.out.println("The ChineseTube is switched on...");
    }

    @Override
    public void switchOff() {
        System.out.println("The ChineseTube is switched off...");
    }

    @Override
    public void tuneLight() {
        System.out.println("The ChineseTube is tuned...");
    }
}
