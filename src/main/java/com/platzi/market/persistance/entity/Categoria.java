package com.platzi.market.persistance.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categoria {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer idCategoria;

    private String descripcion;

    private boolean estado;

    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

}
