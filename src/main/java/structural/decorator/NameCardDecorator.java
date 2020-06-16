package structural.decorator;

/**
 * @author jqq
 * @version 1.0
 * @description
 * @date 2020/6/16 18:30
 **/
public class NameCardDecorator extends Decorator{

    protected NameCardDecorator(BakeryComponent baseComponent) {
        super(baseComponent);
        this.name = "Name Card";
        this.price = 4.0;
    }

    @Override
    public String getName() {
        return super.getName() + "(Please Collect your discount card for "
                + this.price + ")";
    }
}
