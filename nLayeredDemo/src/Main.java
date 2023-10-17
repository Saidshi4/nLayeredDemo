import business.abstracts.ProductService;
import business.concretes.ProductManager;
import dataAccess.concretes.HibernateProductDao;
import entities.concretes.Product;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductManager(new HibernateProductDao());

        Product product = new Product(0,2,"alma",12,50);
        productService.add(product);
    }
}