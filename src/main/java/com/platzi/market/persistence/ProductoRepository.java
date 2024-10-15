package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.ProductoCrudRepository;
import com.platzi.market.persistence.entitys.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto>getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public List<Producto>getByCategoria(int idCategoria){
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    public Optional<List<Producto>>getEscasos(int cantidad,boolean estado){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad,true);
    }

    public Optional<List<Producto>>getByCodigoBarra(String codigoBarras){
        return productoCrudRepository.findByCodigoBarras(codigoBarras);
    }

    public Optional<List<Producto>>getByRangeOfPrices(Double precioMin, Double precioMax){
        return productoCrudRepository.findByPrecioVentaBetween(precioMin,precioMax);
    }

    public Optional<List<Producto>>getByPriceGreaterThanSpecificValue(Double precioVenta){
        return productoCrudRepository.findByPrecioVentaGreaterThanEqual(precioVenta);
    }

    public Optional<Producto>getProducto(int idProducto){
        return productoCrudRepository.findById(idProducto);
    }

    public Producto save(Producto producto){
        return productoCrudRepository.save(producto);
    }

    public void delete(int idProducto){
        productoCrudRepository.deleteById(idProducto);
    }

}
