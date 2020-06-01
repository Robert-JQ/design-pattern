package creation.simplefactory;

/**
 * @author jqq
 * @version 1.0
 * @description 风扇工厂
 * @date 2020/6/1 14:57
 **/
public interface IFanFactory {

    IFan createFan(FanType type);

}
