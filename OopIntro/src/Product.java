public class Product {

    Product() {
        System.out.println("ready");
    }

    Product(int id, String name, double unitPrice, String detail) {
        this(); // if you call Product() without parameters
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;

    }

    int id;
    String name;
    double unitPrice;
    String detail;

}
