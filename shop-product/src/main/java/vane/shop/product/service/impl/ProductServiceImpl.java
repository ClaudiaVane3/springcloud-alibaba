package vane.shop.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vane.shop.common.entity.Product;
import vane.shop.product.dao.ProductDao;
import vane.shop.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

  @Autowired private ProductDao productDao;

  @Override
  public Product findByPid(Integer pid) {
    return productDao.findById(pid).get();
  }
}
