package structural.decorator;

/**
 * @author jqq
 * @version 1.0
 * @description 奶油装饰器
 * @date 2020/6/16 18:25
 **/
public class CreamDecorator extends Decorator{

    protected CreamDecorator(BakeryComponent baseComponent) {
        super(baseComponent);
        this.name = "Cream";
        this.price = 1.0;
    }

}
