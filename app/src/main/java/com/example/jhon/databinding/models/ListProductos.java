package com.example.jhon.databinding.models;

import com.example.jhon.databinding.adapters.ListAdapter;

import java.util.List;

/**
 * Created by jhon on 8/09/16.
 */
public class ListProductos {
    List<Producto> allProductos;

    public ListProductos(List<Producto> allProductos) {
        this.allProductos = allProductos;
    }

    public List<Producto> getAllProductos() {
        return allProductos;
    }

    public void setAllProductos(List<Producto> allProductos) {
        this.allProductos = allProductos;
    }
}
