package structural.decorator;

/**
 * @author jqq
 * @version 1.0
 * @description
 * @date 2020/6/16 18:44
 **/
public class Util {

    public static void printProductDetails(BakeryComponent bComponent) {
        String out = "Item: " + bComponent.getName() + ", " + "Price: " + bComponent.getPrice();
        System.out.println(out);
    }

}
