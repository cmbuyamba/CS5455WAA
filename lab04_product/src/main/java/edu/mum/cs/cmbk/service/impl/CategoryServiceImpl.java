package edu.mum.cs.cmbk.service.impl;

import java.util.ArrayList;
import java.util.List;

import edu.mum.cs.cmbk.domain.Category;
import edu.mum.cs.cmbk.service.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    private List<Category> categories;

    public CategoryServiceImpl() {
        categories = new ArrayList<Category>();
        Category computerCategory = new Category(1, "Computer");
        Category sportsCategory = new Category(2, "Sports");
        Category foodCategory = new Category(3, "Food");
        categories.add(computerCategory);
        categories.add(sportsCategory);
        categories.add(foodCategory);
    }

    public List<Category> getAll() {
        return categories;
    }

    public Category getCategory(int id) {
        for (Category category : categories) {
            if (id == category.getId()) {
                return category;
            }
        }
        return null;
    }
}
 
