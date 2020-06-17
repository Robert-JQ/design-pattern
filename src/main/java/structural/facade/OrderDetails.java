package structural.facade;

import java.util.Random;

/**
 * @author jqq
 * @version 1.0
 * @description
 * @date 2020/6/17 18:36
 **/
public class OrderDetails {

    private String productName;

    private int productNo;

    private String prodDescription;

    private double price;

    private double discountPercent;

    private String addressLine1;

    private String addressLine2;

    private int pinCode;

    private String cardNo;

    public OrderDetails(String productName, String prodDescription, double price, double discount,
                        String addressLine1, String addressLine2, int pinCode, String cardNo) {
        this.productNo = new Random(1).nextInt(100);
        this.productName = productName;
        this.prodDescription = prodDescription;
        this.price = price;
        this.discountPercent = discount;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.pinCode = pinCode;
        this.cardNo = cardNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductNo() {
        return productNo;
    }

    public void setProductNo(int productNo) {
        this.productNo = productNo;
    }

    public String getProdDescription() {
        return prodDescription;
    }

    public void setProdDescription(String prodDescription) {
        this.prodDescription = prodDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
}
