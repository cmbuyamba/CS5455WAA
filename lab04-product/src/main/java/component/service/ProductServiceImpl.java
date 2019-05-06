package component.service;

import java.util.List;

import domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import component.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
  	public List<Product> getAll() {
		return productRepository.getAll();
	}
	
	public void save(Product product) {
		productRepository.save(product);

	}
	
	
		   
}
 
