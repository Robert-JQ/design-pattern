package structural.adapter;

public class LaptopMain {

    public static void main(String[] args) {
        VgaDisplay vgaDisplay = new VgaDisplay();
        Vga2HdmiAdapter adapter = new Vga2HdmiAdapter(vgaDisplay);
        operateHdmiLaptop(adapter);
    }

    static void operateHdmiLaptop(IHdmi hdmiDisplay) {
        hdmiDisplay.openHdmi();
    }
}
