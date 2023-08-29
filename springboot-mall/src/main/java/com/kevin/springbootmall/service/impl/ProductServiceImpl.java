package com.kevin.springbootmall.service.impl;

import com.kevin.springbootmall.dao.ProductDao;
import com.kevin.springbootmall.dto.ProductRequest;
import com.kevin.springbootmall.model.Product;
import com.kevin.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;
    @Override
    public Product getProductById(int productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public int createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}
