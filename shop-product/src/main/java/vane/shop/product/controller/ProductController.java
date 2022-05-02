package vane.shop.product.controller;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vane.shop.common.entity.Product;
import vane.shop.product.service.ProductService;

@RestController
@Slf4j
public class ProductController {

  @Autowired private ProductService productService;

  @GetMapping("/product")
  public Product product(@RequestParam Integer pid) {
    Product product = productService.findByPid(pid);
    log.info("retrieved product : {}", JSON.toJSONString(product));
    return product;
  }
}
