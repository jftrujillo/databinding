package com.example.jhon.databinding;

import android.annotation.TargetApi;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Fade;
import android.transition.TransitionInflater;

import com.example.jhon.databinding.databinding.ActivityDetailListBinding;
import com.example.jhon.databinding.models.Producto;

public class DetailListActivity extends AppCompatActivity {

    Bundle bundle;
    Producto producto;
    int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDetailListBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_detail_list);
        bundle = getIntent().getExtras();
        index = bundle.getInt("index");
        producto = Util.getProducto().get(index);
        binding.setProduct(producto);
        overridePendingTransition(R.animator.slide_in, R.animator.slide_out);

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();

    }
}
