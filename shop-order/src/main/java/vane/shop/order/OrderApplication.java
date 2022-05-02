package vane.shop.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableJpaRepositories(basePackages = {"vane.shop.order.dao"})
@ComponentScan(value = {"vane.*", "vane.shop.order.dao"})
@EntityScan("vane.shop.common.entity")
@EnableDiscoveryClient
@SpringBootApplication
public class OrderApplication {

  public static void main(String[] args) {
    SpringApplication.run(OrderApplication.class, args);
  }

  @Bean
  public RestTemplate getRestTemplate() {
    return new RestTemplate();
  }
}
