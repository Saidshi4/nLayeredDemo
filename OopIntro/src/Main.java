public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(1,"Lenovo V14",15000,"16 GB RAM"); // to create reference, instance

        Product product2 = new Product();
        product2.id = 2;
        product2.name = "Lenovo V15";
        product2.unitPrice = 20000;
        product2.detail = "32 GB RAM";

        Product product3 = new Product();
        product3.id = 3;
        product3.name = "HP 5";
        product3.unitPrice = 25000;
        product3.detail = "8 GB RAM";


        Product[] products = {product1,product2,product3};

        for (Product product : products){
            System.out.println(product.name);

        }

        Category category1 = new Category();
        category1.id = 1;
        category1.name = "Computer";

        Category category2 = new Category();
        category2.id = 1;
        category2.name = "Home/Garden";

        Category[] categories = {category1,category2};

        for (Category category : categories){
            System.out.println(category.name);
        }


    }
}