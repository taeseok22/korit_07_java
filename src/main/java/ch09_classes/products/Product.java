package ch09_classes.products;

public class Product {

    int productNum;
    String productName;

    Product(int productNum) {
        this.productNum = productNum;
    }

    Product(String productName) {
        this.productName = productName;
    }


    void showInfo() {
        System.out.println("시리얼 넘버 : " + productNum);
        System.out.println("제품 타이틀 : " + productName);
    }
}
