package business.concretes;

import business.abstracts.ProductService;
import dataAccess.abstracts.ProductDao;
import entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {

    private ProductDao productDao;

    public ProductManager(ProductDao productDao) {
        super();
        this.productDao = productDao;
    }

    @Override
    public void add(Product product) {
        if(product.getId() == 1){
            System.out.println("it is not true");
            return;
        }
        this.productDao.add(product);
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
