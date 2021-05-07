package com.example.primerparciallabov;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.icu.text.UnicodeSetSpanner;
import android.os.Bundle;
import android.util.Log;
import android.widget.Adapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<UsuarioModel> listaUsuarios;
    UsuarioAdapter adapter;
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.listaUsuarios = new ArrayList<>();

        for (int i=0;i<30;i++){
            this.listaUsuarios.add(new UsuarioModel("Nombre"+(i*21),(i%2 == 0)?getString(R.string.administrador):getString(R.string.usuario), "admin123"));
        }

        this.adapter = new UsuarioAdapter(this);
        this.rv = super.findViewById(R.id.rvUsuarios);
        rv.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);

        rv.setLayoutManager(linearLayoutManager);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(UsuarioActivity.model != null){
            this.listaUsuarios.set(UsuarioActivity.index,UsuarioActivity.model);
            UsuarioActivity.model = null;
            this.rv.setAdapter(adapter);
            //Toast.makeText(this,"Usuario modificado", Toast.LENGTH_LONG).show();
        }
    }
}