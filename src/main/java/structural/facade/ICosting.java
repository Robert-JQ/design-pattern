package structural.facade;

/**
 * @author jqq
 * @version 1.0
 * @description 费用计算接口
 * @date 2020/6/17 18:25
 **/
public interface ICosting {

    double applyDiscount(double price, double discountPercent);

}
