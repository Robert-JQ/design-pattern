package structural.adapter;

/**
 * 支持VGA接口的显示器
 */
public class VgaDisplay implements IVga {

    @Override
    public void openVga() {
        System.out.println("Opening..VGA Display...");
    }

}
