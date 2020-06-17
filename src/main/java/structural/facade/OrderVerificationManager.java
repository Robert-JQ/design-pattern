package structural.facade;

/**
 * @author jqq
 * @version 1.0
 * @description 订单校验实现
 * @date 2020/6/17 18:23
 **/
public class OrderVerificationManager implements IOrderVerify{

    @Override
    public boolean verifyShippingAddress(int pincode) {
        System.out.println("The product can be shipped to the pincode " + pincode);
        return true;
    }

}
