package com.platzi.market.persistance.crud;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.platzi.market.persistance.entity.Producto;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    
    @Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true) //esto es opcional, pues no es necesario usando query methods (lo de abajo)
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
