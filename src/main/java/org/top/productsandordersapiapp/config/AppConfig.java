package org.top.productsandordersapiapp.config;
//Класс конфигурации зависимостей приложения от класса RdbProductService
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.top.productsandordersapiapp.rdb.ProductRepository;
import org.top.productsandordersapiapp.rdb.RdbProductService;
import org.top.productsandordersapiapp.service.ProductService;

// Конфигурация зависимостей приложения
@Configuration //аннотация
public class AppConfig {

    @Bean // аннотация, позволяющая получить зависимость
    public ProductService productService(ProductRepository productRepository) { //внедрение как инъекция зависимости DI через параметр productRepository
        return new RdbProductService(productRepository);
    }
}
