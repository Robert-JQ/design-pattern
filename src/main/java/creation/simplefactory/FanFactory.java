package creation.simplefactory;

/**
 * @author jqq
 * @version 1.0
 * @description
 * @date 2020/6/1 15:06
 **/
public class FanFactory implements IFanFactory {
    @Override
    public IFan createFan(FanType type) {
        switch (type) {
            case TableFan:
                return new TableFan();
            case CeilingFan:
                return new CeilingFan();
            case ExhaustFan:
                return new ExhaustFan();
            default:
                return new TableFan();
        }
    }
}
