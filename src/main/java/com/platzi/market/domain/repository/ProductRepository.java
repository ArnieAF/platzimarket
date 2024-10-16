package com.platzi.market.domain.repository;

import com.platzi.market.domain.Product;
import com.platzi.market.persistence.entitys.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<Product>getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProducts(int quantity);
    Optional<List<Product>> getByBarCode(String barcode);
    Optional<List<Producto>> getByRangeOfPrices(Double min, Double max);
    Optional<List<Producto>> getByPriceGreaterThanSpecificValue(Double salePrice);
    Optional<Product> getProduct(int productId);
    Product save(Product product);
    void delete(int productId);

}
