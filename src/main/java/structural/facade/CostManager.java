package structural.facade;

/**
 * @author jqq
 * @version 1.0
 * @description 费用计算实现
 * @date 2020/6/17 18:26
 **/
public class CostManager implements ICosting {
    @Override
    public double applyDiscount(double price, double discountPercent) {
        String out = String.format("A discount of %f%% has been" +
                "applied on the product's price of %f", discountPercent, price);
        System.out.println(out);
        return price - ((discountPercent / 100) * price);
    }
}
