package com.kevin.springbootmall.dao;

import com.kevin.springbootmall.dto.ProductRequest;
import com.kevin.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    Product getProductById(Integer productId);

    int createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

    List<Product> getProducts();
}
