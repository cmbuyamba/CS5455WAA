package component.repository;

import domain.Category;

import java.util.List;


 public interface CategoryRepository   {
	
 
		 Category getCategory(int id);
		
		 List<Category> getAll();
		   
	
}
 
