package creation.builder.classicbuilder;

/**
 * @author jqq
 * @version 1.0
 * @description 导演(指导构建者构造产品)
 * @date 2020/6/11 17:35
 **/
public class Director {

    public void construct(IMobilePhoneBuilder phoneBuilder) {
        phoneBuilder.buildPhoneName();
        phoneBuilder.buildBattery();
        phoneBuilder.buildOS();
        phoneBuilder.buildScreen();
        phoneBuilder.buildStylus();
    }

}
