package structural.adapter;

/**
 * VGA转HDMI适配器
 */
public class Vga2HdmiAdapter implements IHdmi {

    private IVga vgaDisplay;

    public Vga2HdmiAdapter(IVga vgaDisplay) {
        this.vgaDisplay = vgaDisplay;
    }

    @Override
    public void openHdmi() {
        // 适配逻辑
        this.vgaDisplay.openVga();
        System.out.println("Opening HDMI device");
    }
}
