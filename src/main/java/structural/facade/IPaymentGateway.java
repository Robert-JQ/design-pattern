package structural.facade;

/**
 * @author jqq
 * @version 1.0
 * @description 支付接口
 * @date 2020/6/17 18:29
 **/
public interface IPaymentGateway {

    boolean verifyCardDetails(String cardNo);

    boolean processPayment(String cardNo, double cost);

}
