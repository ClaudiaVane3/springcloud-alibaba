package vane.shop.order.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import vane.shop.common.entity.Order;

public interface OrderDao extends JpaRepository<Order, Long> {}
