package org.top.productsandordersapiapp.rdb;
//класс RdbProductService имплементирует ProductService
//внедряет бизнес-логику

import org.springframework.stereotype.Service;
import org.top.productsandordersapiapp.entity.Product;
import org.top.productsandordersapiapp.service.ProductService;

import java.util.List;
import java.util.Optional;

@Service
public class RdbProductService implements ProductService {

    // внедрение репоизторий в имплементацию сервиса через DI
    private final ProductRepository productRepository;

    public RdbProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    //получение всего списка
    public List<Product> getAll() {
        return (List<Product>)productRepository.findAll();
    }

    @Override
    //получение продукта по id
    public Optional<Product> getById(Integer id) {
        return productRepository.findById(id);
    }

    @Override
    //добавление продукта
    public Product add(Product product) {
        return productRepository.save(product);
    }

    @Override
    //удаляет объект, возвращает значение Boolean
    public Boolean deleteById(Integer id) {
        Optional<Product> deleted = productRepository.findById(id);

        if (deleted.isPresent()) {
            productRepository.deleteById(id);
        }
        return deleted.isPresent();
    }

    @Override
    //изменение продукта
    public Optional<Product> update(Product product) {
        Optional<Product> updated = productRepository.findById(product.getId());
        //если продукт по id имеется
        if (updated.isPresent()) {
            productRepository.save(product);//сохранить изменения
            return Optional.of(product); // вернуть новое значение
        }
        //иначе вернуть empty
        return Optional.empty();
    }
}
