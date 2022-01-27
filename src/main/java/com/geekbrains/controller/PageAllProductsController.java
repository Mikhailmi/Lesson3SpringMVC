package com.geekbrains.controller;

import com.geekbrains.aboutProducts.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageAllProductsController {
    ProductRepository productRepository = new ProductRepository();


    @GetMapping("/all")
    public String index(Model model) {
        String str = productRepository.allProducts(productRepository.products);
        model.addAttribute("message", str);
        return "allProducts";
    }

}
