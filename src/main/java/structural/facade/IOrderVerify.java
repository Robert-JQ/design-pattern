package structural.facade;

/**
 * @author jqq
 * @version 1.0
 * @description 订单校验接口
 * @date 2020/6/17 18:22
 **/
public interface IOrderVerify {

    boolean verifyShippingAddress(int pincode);

}
