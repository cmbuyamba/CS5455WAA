package component.repository;

import java.util.ArrayList;
import java.util.List;

import domain.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private List<Product> listOfProducts = new ArrayList<>();

    public List<Product> getAll() {
        return listOfProducts;
    }

    public void save(Product product) {
        listOfProducts.add(product);
    }
}