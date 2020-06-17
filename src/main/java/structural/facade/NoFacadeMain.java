package structural.facade;

/**
 * @author jqq
 * @version 1.0
 * @description 不使用门面模式的实现
 * @date 2020/6/17 18:40
 **/
public class NoFacadeMain {

    public static void main(String[] args) {
        OrderDetails orderDetails = new OrderDetails("Java Design Pattern book"
        , "Simplified book on design pattern in Java", 500, 10, "Street No 1",
                "Educational Area", 1212, "77293438");

        // 更新库存
        IInventory inventory = new InventoryManager();
        inventory.update(orderDetails.getProductNo());

        // 验证订单详情(比如:送货地址)
        IOrderVerify orderVerify = new OrderVerificationManager();
        orderVerify.verifyShippingAddress(orderDetails.getPinCode());

        // 计算总费用
        ICosting costing = new CostManager();
        orderDetails.setPrice(costing.applyDiscount(orderDetails.getPrice(), orderDetails.getDiscountPercent()));

        IPaymentGateway paymentGateway = new PaymentGatewayManager();
        paymentGateway.verifyCardDetails(orderDetails.getCardNo());
        paymentGateway.processPayment(orderDetails.getCardNo(), orderDetails.getPrice());

        ILogistics logistics = new LogisticsManager();
        String shippingAddress = String.format("%s, %s - %d",
                orderDetails.getAddressLine1(), orderDetails.getAddressLine2(),
                orderDetails.getPinCode());
        logistics.shipProducts(orderDetails.getProductName(), shippingAddress);

    }


}
