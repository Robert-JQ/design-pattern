package structural.decorator;

/**
 * @author jqq
 * @version 1.0
 * @description
 * @date 2020/6/16 18:18
 **/
public class CakeBase implements BakeryComponent {

    private String name = "Cake Base";

    private double price = 200.0;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
