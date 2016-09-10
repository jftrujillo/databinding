package com.example.jhon.databinding;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.jhon.databinding.databinding.ActivityMainBinding;
import com.example.jhon.databinding.models.ListProductos;
import com.example.jhon.databinding.models.Producto;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    List<Producto> data;
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        list = (ListView) findViewById(R.id.list);
        overridePendingTransition(R.animator.slide_in, R.animator.slide_out);
        //region set Datos de prueba
        data = new ArrayList<>();
        Producto producto = new Producto();
        producto.setPrecio("1000");
        producto.setImagen("http://goo.gl/1Yvlve");
        producto.setMarca("Hola");
        producto.setNombre("Pan");

        data.add(producto);

        Producto producto1 = new Producto();
        producto1.setPrecio("1000");
        producto1.setImagen("http://goo.gl/1Yvlve");
        producto1.setMarca("Hola");
        producto1.setNombre("Pan");

        data.add(producto1);
        Producto producto2 = new Producto();
        producto2.setPrecio("1000");
        producto2.setImagen("http://goo.gl/1Yvlve");
        producto2.setMarca("Hola");
        producto2.setNombre("Pan");
        data.add(producto2);

        //endregion
        ListProductos listProductos = new ListProductos(data);
        Util.getProducto().addAll(data);
        binding.setProducts(listProductos);
        list.setOnItemClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        overridePendingTransition(R.animator.slide_in, R.animator.slide_out);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        startActivity(new Intent(this,DetailListActivity.class).putExtra("index",i));
    }

}
