package creation.builder.classicbuilder;

/**
 * @author jqq
 * @version 1.0
 * @description
 * @date 2020/6/11 17:31
 **/
public class WindowsPhoneBuilder implements IMobilePhoneBuilder {

    private MobilePhone phone;

    public WindowsPhoneBuilder() {
        phone = new MobilePhone();
    }

    @Override
    public void buildPhoneName() {
        phone.setPhoneName("Windows Phone");
    }

    @Override
    public void buildScreen() {
        phone.setPhoneScreen(ScreenType.SCREENTYPE_TOUCH_CAPACITIVE);
    }

    @Override
    public void buildBattery() {
        phone.setPhoneBattery(Battery.MAH_2000);
    }

    @Override
    public void buildOS() {
        phone.setPhoneOS(OperatingSystem.WINDOWS_PHONE);
    }

    @Override
    public void buildStylus() {
        phone.setPhoneStylus(Stylus.NO);
    }

    @Override
    public MobilePhone getPhone() {
        return this.phone;
    }
}
