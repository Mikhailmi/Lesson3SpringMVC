package com.geekbrains.controller;

import com.geekbrains.aboutProducts.Product;
import com.geekbrains.aboutProducts.ProductAdd;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/addProduct")
public class AddProductsController {

    private ProductAdd productAdd;

    @RequestMapping(params = "form", method = RequestMethod.POST)
    public String create(Product product) {
        productAdd.productAdd(product);

        return "продукт добавлен: " + product.getId() + " " + product.getTitle() + " " + product.getCost();
    }
}