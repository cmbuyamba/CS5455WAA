package component.repository;

import java.util.List;
import domain.Product;

public interface ProductRepository   {
	
 
	
	 List<Product> getAll();
	
	 void save(Product product);
	
}
 
