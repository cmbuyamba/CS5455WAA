package component.controller;

import domain.Category;
import domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import component.service.CategoryService;
import component.service.ProductService;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    CategoryService categoryService;

    @RequestMapping(value = {"/", "/product"}, method = RequestMethod.GET)
    public String inputProduct(@ModelAttribute("newProduct") Product newProduct, Model model) {

        List<Category> categories = categoryService.getAll();
        model.addAttribute("categories", categories);
        return "new_product";
    }

    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("newProduct") Product newProduct) {
        Category category = categoryService.getCategory(newProduct.getCategory().getId());
        newProduct.setCategory(category);
        productService.save(newProduct);
        return "product";
    }


    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public String listProducts(Model model) {

        List<Product> list = productService.getAll();
        model.addAttribute("products", list);

        return "products";
    }

}
