package org.top.productsandordersapiapp.service;
//пакет service реализует бизнес логику

import org.springframework.stereotype.Service;
import org.top.productsandordersapiapp.entity.Product;

import java.util.List;
import java.util.Optional;

// интерфейс (контракт) ProductService описывает операции с сущностью Product
@Service
public interface ProductService {
    // 1. получить все записи
    List<Product> getAll();                // в системе сервисы выдают в виде списка все записи с помощью метода getAll
    // 2. получить запись по id
    Optional<Product> getById(Integer id); //Optional – объект-контейнер, используемый для хранения ненулевых объектов, возвращает запись по ID с помощью метода getById
    // 3. добавить новую запись
    Product add(Product product);          //добавить новую запись с помощью метода add
    // 4. удалить запись по id
    Boolean deleteById(Integer id);        //возвращает Boolean, переменные которого принимают одно из значений: true (истина, УДАЛЕН); false (ложь, НЕ УДАЛЕН), с помощью метода deleteById
    // 5. изменить запись
    Optional<Product> update(Product product); //с помощью метода update возвращает измененную запись
}
