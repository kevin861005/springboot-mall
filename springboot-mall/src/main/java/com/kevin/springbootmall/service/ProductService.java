package com.kevin.springbootmall.service;

import com.kevin.springbootmall.constant.ProductCategory;
import com.kevin.springbootmall.dto.ProductRequest;
import com.kevin.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    Product getProductById(Integer productId);

    int createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

    List<Product> getProducts(ProductCategory category, String search);
}
