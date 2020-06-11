package creation.builder;

/**
 * @author jqq
 * @version 1.0
 * @description 构建者接口
 * @date 2020/6/11 12:01
 **/
public interface IMobilePhoneBuilder {
    void buildPhoneName();
    void buildScreen();
    void buildBattery();
    void buildOS();
    void buildStylus();
    MobilePhone getPhone();
}
