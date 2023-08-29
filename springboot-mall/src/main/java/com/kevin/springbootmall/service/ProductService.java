package com.kevin.springbootmall.service;

import com.kevin.springbootmall.dto.ProductRequest;
import com.kevin.springbootmall.model.Product;

public interface ProductService {

    public Product getProductById(int productId);

    public int createProduct(ProductRequest productRequest);
}
