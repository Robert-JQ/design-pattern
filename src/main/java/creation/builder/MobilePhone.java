package creation.builder;

/**
 * @author jqq
 * @version 1.0
 * @description 手机产品
 * @date 2020/6/11 11:52
 **/
public class MobilePhone {

    private String phoneName;

    private ScreenType phoneScreen;

    private Battery phoneBattery;

    private OperatingSystem phoneOS;

    private Stylus phoneStylus;

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public ScreenType getPhoneScreen() {
        return phoneScreen;
    }

    public void setPhoneScreen(ScreenType phoneScreen) {
        this.phoneScreen = phoneScreen;
    }

    public Battery getPhoneBattery() {
        return phoneBattery;
    }

    public void setPhoneBattery(Battery phoneBattery) {
        this.phoneBattery = phoneBattery;
    }

    public OperatingSystem getPhoneOS() {
        return phoneOS;
    }

    public void setPhoneOS(OperatingSystem phoneOS) {
        this.phoneOS = phoneOS;
    }

    public Stylus getPhoneStylus() {
        return phoneStylus;
    }

    public void setPhoneStylus(Stylus phoneStylus) {
        this.phoneStylus = phoneStylus;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "phoneName='" + phoneName + '\'' +
                ", phoneScreen=" + phoneScreen +
                ", phoneBattery=" + phoneBattery +
                ", phoneOS=" + phoneOS +
                ", phoneStylus=" + phoneStylus +
                '}';
    }
}
