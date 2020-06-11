package creation.builder;

/**
 * @author jqq
 * @version 1.0
 * @description
 * @date 2020/6/11 17:39
 **/
public class ClassicBuilderMain {

    public static void main(String[] args) {
        // 先创建导演
        Director director = new Director();
        // 准备Builder接口
        IMobilePhoneBuilder phoneBuilder;
        // 制造一部安卓手机
        phoneBuilder = new AndroidPhoneBuilder();
        director.construct(phoneBuilder);
        String output = String.format("A new Phone build:\n\n%s", phoneBuilder.getPhone());
        System.out.println(output);

        // 制造一部Windows手机
        phoneBuilder = new WindowsPhoneBuilder();
        director.construct(phoneBuilder);
        output = String.format("A new Phone build:\n\n%s", phoneBuilder.getPhone());
        System.out.println(output);
    }

}
