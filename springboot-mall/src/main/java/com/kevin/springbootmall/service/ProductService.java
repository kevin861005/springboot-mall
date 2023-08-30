package com.kevin.springbootmall.service;

import com.kevin.springbootmall.dto.ProductRequest;
import com.kevin.springbootmall.model.Product;

public interface ProductService {

    public Product getProductById(Integer productId);

    public int createProduct(ProductRequest productRequest);

    public void updateProduct(Integer productId, ProductRequest productRequest);

    public void deleteProductById(Integer productId);
}
