package ch09_classes.products;

public class Product {

    int productNum;
    String productName;

    public Product() {

    }

    public Product(int productNum) {
        this.productNum = productNum;
    }

    public Product(String productName) {
        this.productName = productName;
    }

    public Product(int productNum, String productName) {
        this.productNum = productNum;
        this.productName = productName;
    }


    public void showInfo() {
        System.out.println("\n시리얼 넘버 : " + productNum);
        System.out.println("제품 타이틀 : " + productName);
    }
}
