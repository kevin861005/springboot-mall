package com.kevin.springbootmall.dao;

import com.kevin.springbootmall.dto.ProductRequest;
import com.kevin.springbootmall.model.Product;

public interface ProductDao {

    public Product getProductById(Integer productId);

    public int createProduct(ProductRequest productRequest);

    public void updateProduct(Integer productId, ProductRequest productRequest);
}
