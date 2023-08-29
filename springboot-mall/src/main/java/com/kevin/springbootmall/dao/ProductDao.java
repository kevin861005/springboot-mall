package com.kevin.springbootmall.dao;

import com.kevin.springbootmall.dto.ProductRequest;
import com.kevin.springbootmall.model.Product;

public interface ProductDao {

    public Product getProductById(int productId);

    public int createProduct(ProductRequest productRequest);
}
