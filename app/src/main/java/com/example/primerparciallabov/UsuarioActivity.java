package com.example.primerparciallabov;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class UsuarioActivity extends AppCompatActivity {
    public static UsuarioModel model;
    public static int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(this.getString(R.string.editar_usuario));
        actionBar.setDisplayHomeAsUpEnabled(true);

        Bundle extras = super.getIntent().getExtras();
        UsuarioModel localModel = (UsuarioModel) extras.getSerializable("model");
        UsuarioActivity.index = extras.getInt("index");

        UsuarioView view = new UsuarioView(this,localModel);
        UsuarioController controller = new UsuarioController(this,localModel,view);
        view.mostrarModel();
        view.setController(controller);

    }



    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            this.finish();
        }
        return true;
    }
}