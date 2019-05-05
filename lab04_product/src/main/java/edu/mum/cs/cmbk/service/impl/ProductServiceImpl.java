package edu.mum.cs.cmbk.service.impl;

import java.util.ArrayList;
import java.util.List;

import edu.mum.cs.cmbk.domain.Product;
import edu.mum.cs.cmbk.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private List<Product> listOfProducts = new ArrayList<Product>();

    public List<Product> getAll() {
        return listOfProducts;
    }

    public void save(Product product) {
        listOfProducts.add(product);
    }
}
 
