import business.abstracts.ProductService;
import business.concretes.ProductManager;
import core.JLoggerManagerAdapter;
import dataAccess.concretes.AbcProductDao;
import dataAccess.concretes.HibernateProductDao;
import entities.concretes.Product;
import jLogger.JLoggerManager;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter(new JLoggerManager()));

        Product product = new Product(0,2,"apple",12,50);
        productService.add(product);
    }
}