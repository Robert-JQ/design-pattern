package structural.facade;

/**
 * @author jqq
 * @version 1.0
 * @description 使用门面模式
 * @date 2020/6/17 19:00
 **/
public class FacadeMain {

    public static void main(String[] args) {
        OrderDetails orderDetails = new OrderDetails("Java Design Pattern book"
                , "Simplified book on design pattern in Java", 500, 10, "Street No 1",
                "Educational Area", 1212, "77293438");
        OnlineShoppingFacade facade = new OnlineShoppingFacade();
        facade.finalizeOrder(orderDetails);
    }

}
