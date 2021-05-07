package com.example.primerparciallabov;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class UsuarioController implements View.OnClickListener {
    private UsuarioModel model;
    private UsuarioView view;
    private Activity activity;

    public UsuarioController(UsuarioActivity activity, UsuarioModel model, UsuarioView view){
        this.activity =activity;
        this.model = model;
        this.view = view;
    }

    public boolean ValidarModel(){
        boolean nombreValido = this.model.getNombre().length() >= 3;
        boolean contraseñaValida = this.model.getContraseña().equals(this.view.getEtContraseñaRepetida().getText().toString());
        return nombreValido && contraseñaValida;
    }



    @Override
    public void onClick(View view) {

        this.view.guardarModel();
        if(view.getId() == R.id.btnGuardar){
            if(ValidarModel()){
                UsuarioActivity.model = this.model;
                this.activity.finish();
            }
            else
            {
                Toast.makeText(this.activity,"Hay campos invalidos",Toast.LENGTH_LONG).show();
            }
        }
    }
}
