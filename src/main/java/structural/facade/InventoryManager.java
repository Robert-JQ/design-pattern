package structural.facade;

/**
 * @author jqq
 * @version 1.0
 * @description 库存实现
 * @date 2020/6/17 18:19
 **/
public class InventoryManager implements IInventory {

    @Override
    public void update(int productId) {
        String msg = "Product# " + productId + " is substracted from store's inventory";
        System.out.println(msg);
    }

}
