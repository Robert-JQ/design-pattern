package structural.decorator;

/**
 * @author jqq
 * @version 1.0
 * @description
 * @date 2020/6/16 18:42
 **/
public class DecoratorMain {

    public static void main(String[] args) {
        // 先创建一个蛋糕
        CakeBase cake = new CakeBase();
        Util.printProductDetails(cake);

        // 在蛋糕上添加奶油
        CreamDecorator creamCake = new CreamDecorator(cake);
        Util.printProductDetails(creamCake);

        // 在蛋糕上添加樱桃
        CherryDecorator cherryCake = new CherryDecorator(creamCake);
        Util.printProductDetails(cherryCake);

        // 给蛋糕添加香味
        ScentDecorator scentCake = new ScentDecorator(cherryCake);
        Util.printProductDetails(scentCake);

        NameCardDecorator nameCardCake = new NameCardDecorator(scentCake);
        Util.printProductDetails(nameCardCake);

        // 创建一个简单糕点
        PastryBase pastry = new PastryBase();
        Util.printProductDetails(pastry);

        // 在糕点上添加奶油和樱桃
        CreamDecorator creamPastry = new CreamDecorator(pastry);
        CherryDecorator cherryPastry = new CherryDecorator(creamPastry);
        Util.printProductDetails(cherryPastry);
    }

}
