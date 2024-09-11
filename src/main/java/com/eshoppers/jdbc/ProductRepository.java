package com.eshoppers.jdbc;

import java.util.List;

public interface ProductRepository {
    void save(Product product);

    List<Product> findAll();

    void update(Product product);

    void delete(long id);
}
