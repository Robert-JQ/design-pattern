package structural.decorator;

/**
 * @author jqq
 * @version 1.0
 * @description 樱桃装饰器
 * @date 2020/6/16 18:27
 **/
public class CherryDecorator extends Decorator {

    protected CherryDecorator(BakeryComponent baseComponent) {
        super(baseComponent);
        this.name = "Cherry";
        this.price = 2.0;
    }

}
