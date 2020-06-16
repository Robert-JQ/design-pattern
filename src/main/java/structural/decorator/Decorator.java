package structural.decorator;

/**
 * @author jqq
 * @version 1.0
 * @description 装饰器
 * @date 2020/6/16 18:21
 **/
public abstract class Decorator implements BakeryComponent{

    private BakeryComponent baseComponent = null;

    protected String name = "Undefined Decorator";

    protected double price = 0.0;

    protected Decorator(BakeryComponent baseComponent) {
        this.baseComponent = baseComponent;
    }

    @Override
    public String getName() {
        return baseComponent.getName() + ", " + this.name;
    }

    @Override
    public double getPrice() {
        return price + baseComponent.getPrice();
    }
}
