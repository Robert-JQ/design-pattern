package structural.facade;

/**
 * @author jqq
 * @version 1.0
 * @description 门面模式实现
 * @date 2020/6/17 18:55
 **/
public class OnlineShoppingFacade {

    IInventory inventory = new InventoryManager();
    IOrderVerify orderVerify = new OrderVerificationManager();
    ICosting costing = new CostManager();
    IPaymentGateway paymentGateway = new PaymentGatewayManager();
    ILogistics logistics = new LogisticsManager();

    public void finalizeOrder(OrderDetails orderDetails) {
        inventory.update(orderDetails.getProductNo());
        orderVerify.verifyShippingAddress(orderDetails.getPinCode());
        orderDetails.setPrice(costing.applyDiscount(
                orderDetails.getPrice(), orderDetails.getDiscountPercent()
        ));
        paymentGateway.verifyCardDetails(orderDetails.getCardNo());
        paymentGateway.processPayment(orderDetails.getCardNo(), orderDetails.getPrice());
        String shippingAddress = String.format("%s, %s - %d",
                orderDetails.getAddressLine1(), orderDetails.getAddressLine2(),
                orderDetails.getPinCode());
        logistics.shipProducts(orderDetails.getCardNo(), shippingAddress);
    }

}
