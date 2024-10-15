package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entitys.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

    Optional<List<Producto>> findByCodigoBarras(String codigoBarras);

    Optional<List<Producto>> findByPrecioVentaBetween(Double precioMin, Double precioMax);

    Optional<List<Producto>> findByPrecioVentaGreaterThanEqual(Double precioVenta);

}
