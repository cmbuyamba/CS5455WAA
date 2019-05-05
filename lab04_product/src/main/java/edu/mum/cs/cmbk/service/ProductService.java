package edu.mum.cs.cmbk.service;

import java.util.List;

import edu.mum.cs.cmbk.domain.Product;

public interface ProductService {

    List<Product> getAll();
    void save(Product product);
}
 
