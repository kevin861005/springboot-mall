package com.kevin.springbootmall.dao;

import com.kevin.springbootmall.model.Product;

public interface ProductDao {

    public Product getProductById(int productId);
}
