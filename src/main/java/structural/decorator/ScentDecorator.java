package structural.decorator;

/**
 * @author jqq
 * @version 1.0
 * @description 香味装饰器
 * @date 2020/6/16 18:29
 **/
public class ScentDecorator extends Decorator{

    protected ScentDecorator(BakeryComponent baseComponent) {
        super(baseComponent);
        this.name = "Scent";
        this.price = 3.0;
    }

}
