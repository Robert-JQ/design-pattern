package structural.facade;

/**
 * @author jqq
 * @version 1.0
 * @description 物流实现
 * @date 2020/6/17 18:34
 **/
public class LogisticsManager implements ILogistics {

    @Override
    public void shipProducts(String productName, String shippingAddress) {
        String out = String.format("Congratulation your product %s has been shipped at the following address: %s."
        , productName, shippingAddress);
        System.out.println(out);
    }

}
