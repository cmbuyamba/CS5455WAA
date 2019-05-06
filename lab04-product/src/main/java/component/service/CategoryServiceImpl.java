package component.service;

import java.util.List;

import domain.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import component.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;
	
  	public List<Category> getAll() {
		return categoryRepository.getAll();
	}
	
	public Category getCategory(int id) {
		return categoryRepository.getCategory(id);
 	}
	
	
		   
}
 
