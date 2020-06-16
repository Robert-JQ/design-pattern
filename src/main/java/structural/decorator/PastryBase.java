package structural.decorator;

/**
 * @author jqq
 * @version 1.0
 * @description
 * @date 2020/6/16 18:19
 **/
public class PastryBase implements BakeryComponent {

    private String name = "Pastry Base";

    private double price = 20.0;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
