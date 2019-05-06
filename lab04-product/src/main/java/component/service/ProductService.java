package component.service;

import domain.Product;

import java.util.List;


 public interface ProductService   {
	
	List<Product> getAll();
	
	void save(Product product);
	
	
		   
}
 
