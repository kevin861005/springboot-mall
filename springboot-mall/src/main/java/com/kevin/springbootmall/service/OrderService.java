package com.kevin.springbootmall.service;

import com.kevin.springbootmall.dto.CreateOrderRequest;
import com.kevin.springbootmall.model.Order;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);
}
