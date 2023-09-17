package com.kevin.springbootmall.service;

import com.kevin.springbootmall.dto.CreateOrderRequest;
import com.kevin.springbootmall.dto.OrderQueryParams;
import com.kevin.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

    Order getOrderById(Integer orderId);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Integer countOrder(OrderQueryParams orderQueryParams);
}
