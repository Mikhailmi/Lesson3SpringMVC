package com.geekbrains.aboutProducts;

import com.geekbrains.aboutProducts.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

     public List<Product> products = new ArrayList<>();

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    {
        products.add(new Product(1, "Product 1", 110));
        products.add(new Product(2, "Product 2", 20));
        products.add(new Product(3, "Product 3", 300));
        products.add(new Product(4, "Product 4", 444));
        products.add(new Product(5, "Product 5", 55));
    }


    public String showProductById(int id){
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder.append(products.get(id-1).getId()).
                append(" ").
                append(products.get(id-1).getTitle()).
                append(" ").
                append(products.get(id-1).getCost()).
                append(" ");
        String string = new String(stringBuilder);
        return string;
    }

    public String allProducts(List<Product> products){

        StringBuilder stringBuilder = new StringBuilder("");

        for (int i = 0; i<products.size() && products.get(i) != null; i++) {
            stringBuilder.append(products.get(i).getId()).
                    append(" ").
                    append(products.get(i).getTitle()).
                    append(" ").
                    append(products.get(i).getCost()).
                    append(" ");
        }

        String string = new String(stringBuilder);
        return string;
    }







}
