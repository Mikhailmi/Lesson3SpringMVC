package com.geekbrains.aboutProducts;

public class ProductAdd {

    private ProductRepository productRepository;


    public void productAdd(Product product){
        productRepository.products.add(new Product(product.getId(), product.getTitle(), product.getCost()));
    }

}
