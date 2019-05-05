package edu.mum.cs.cmbk.controller;

import java.util.List;

import edu.mum.cs.cmbk.domain.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.cs.cmbk.domain.Product;
import edu.mum.cs.cmbk.service.CategoryService;
import edu.mum.cs.cmbk.service.ProductService;

@Controller
@RequestMapping
public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    CategoryService categoryService;

    @RequestMapping(value = {"/", "/product"}, method = RequestMethod.GET)
    public String inputProduct(@ModelAttribute("newProduct") Product newProduct, Model model) {
        System.out.println("*************************************");
        List<Category> categories = categoryService.getAll();
        model.addAttribute("categories", categories);
        return "productForm";
    }

    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("newProduct") Product product) {
        Category category = categoryService.getCategory(product.getCategory().getId());
        product.setCategory(category);
        productService.save(product);
        return "product";
    }


    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public String listProducts(Model model) {

        List<Product> products = productService.getAll();
        model.addAttribute("products", products);

        return "products";
    }

}
