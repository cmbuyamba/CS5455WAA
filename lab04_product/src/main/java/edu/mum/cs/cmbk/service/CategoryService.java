package edu.mum.cs.cmbk.service;

import java.util.List;

import edu.mum.cs.cmbk.domain.Category;

public interface CategoryService {
 
		Category getCategory(int id);
		List<Category> getAll();
}