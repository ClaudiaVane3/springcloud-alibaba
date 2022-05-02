package vane.shop.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vane.shop.common.entity.Order;
import vane.shop.order.dao.OrderDao;
import vane.shop.order.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

  @Autowired private OrderDao orderDao;

  @Override
  public void save(Order order) {
    orderDao.save(order);
  }
}
