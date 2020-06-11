package creation.builder;

/**
 * @author jqq
 * @version 1.0
 * @description
 * @date 2020/6/11 12:03
 **/
public class AndroidPhoneBuilder implements IMobilePhoneBuilder{

    private MobilePhone phone;

    public AndroidPhoneBuilder() {
        phone = new MobilePhone();
    }

    @Override
    public void buildPhoneName() {
        phone.setPhoneName("Android Phone");
    }

    @Override
    public void buildScreen() {
        phone.setPhoneScreen(ScreenType.SCREENTYPE_TOUCH_RESITIVE);
    }

    @Override
    public void buildBattery() {
        phone.setPhoneBattery(Battery.MAH_1500);
    }

    @Override
    public void buildOS() {
        phone.setPhoneOS(OperatingSystem.ANDROID);
    }

    @Override
    public void buildStylus() {
        phone.setPhoneStylus(Stylus.YES);
    }

    @Override
    public MobilePhone getPhone() {
        return this.phone;
    }
}
