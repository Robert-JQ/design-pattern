package structural.facade;

/**
 * @author jqq
 * @version 1.0
 * @description 支付实现
 * @date 2020/6/17 18:30
 **/
public class PaymentGatewayManager implements IPaymentGateway {
    @Override
    public boolean verifyCardDetails(String cardNo) {
        String out = "Card# " + cardNo + " has been verified and is accepted.";
        System.out.println(out);
        return true;
    }

    @Override
    public boolean processPayment(String cardNo, double cost) {
        String out = "Card# " + cardNo + " is used to make a payment of " + cost + ".";
        System.out.println(out);
        return true;
    }
}
