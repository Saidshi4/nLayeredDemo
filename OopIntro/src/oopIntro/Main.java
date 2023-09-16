package oopIntro;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(1,"Lenovo V14",15000,"16 GB RAM",10,15); // to create reference, instance

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("hp");
        product2.setUnitPrice(20000);
        product2.setDetail("32 GB RAM");
        product2.setDiscount(15);
        product2.getUnitPriceAfterDiscount();




        Product[] products = {product1,product2};

        for (Product product : products){
            System.out.println(product.getUnitPriceAfterDiscount());

        }

        Category category1 = new Category();
        category1.setId(1);
        category1.setName("Eat");

        Category category2 = new Category();
        category2.setId(2);
        category2.setName("Drink");

        Category[] categories = {category1,category2};

        for (Category category : categories){
            System.out.println(category.getName());
        }

        ProductManager productManager = new ProductManager();

        productManager.addToCart(product1);
        productManager.addToCart(product2);
    }
}