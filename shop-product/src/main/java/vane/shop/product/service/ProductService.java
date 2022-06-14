package vane.shop.product.service;

import vane.shop.common.entity.Product;

public interface ProductService {

  Product findByPid(Integer pid);
}
