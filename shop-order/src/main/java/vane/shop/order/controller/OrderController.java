package vane.shop.order.controller;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import vane.shop.common.entity.Order;
import vane.shop.common.entity.Product;
import vane.shop.order.service.OrderService;

import java.util.Objects;

@RestController
@Slf4j
public class OrderController {

  @Autowired private RestTemplate restTemplate;

  @Autowired private OrderService orderService;

  @GetMapping("/order/prod")
  public Order order(@RequestParam Integer pid) {

    log.info(">> invoke product service...");
    Product product =
        restTemplate.getForObject("http://localhost:8081/product?pid=" + pid, Product.class);
    log.info(">> result from product service : {}", JSON.toJSONString(product));

    Order order =
        new Order(
            1,
            "test user",
            Objects.requireNonNull(product).getPid(),
            product.getPname(),
            product.getPprice(),
            1);
    orderService.save(order);

    return order;
  }
}
