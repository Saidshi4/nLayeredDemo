package business.concretes;

import business.abstracts.ProductService;
import core.LoggerService;
import dataAccess.abstracts.ProductDao;
import entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {

    private final ProductDao productDao;
    private final LoggerService loggerService;
    public ProductManager(ProductDao productDao, LoggerService loggerService) {
        super();
        this.productDao = productDao;
        this.loggerService = loggerService;
    }

    @Override
    public void add(Product product) {
        if(product.getId() == 1){
            System.out.println("it is not true");
            return;
        }
        this.productDao.add(product);
        this.loggerService.logToSystem("Product added: " + product.getName());
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
