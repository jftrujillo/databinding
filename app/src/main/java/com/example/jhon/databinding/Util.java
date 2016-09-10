package com.example.jhon.databinding;

import com.example.jhon.databinding.models.Producto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jhon on 8/09/16.
 */
public class Util {
    private static List<Producto> producto;
    public static List<Producto>  getProducto(){
        if (producto == null){
            producto = new ArrayList<>();
        }
        return producto;
    }
}
