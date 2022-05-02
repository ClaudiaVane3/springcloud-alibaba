package vane.shop.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import vane.shop.common.entity.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {}
