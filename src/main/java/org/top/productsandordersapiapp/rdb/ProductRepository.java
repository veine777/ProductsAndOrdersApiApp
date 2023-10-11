package org.top.productsandordersapiapp.rdb;
//пакет RDB
// RDB (Relational Database) — это такая база данных, которая воспринимается ее пользователями как множество переменных
// (т.е. переменных отношения — relvar), значениями которых являются отношения или, менее формально, таблицы.
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.top.productsandordersapiapp.entity.Product;

@Repository //аннотация через к которую обращаемся к базе
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
