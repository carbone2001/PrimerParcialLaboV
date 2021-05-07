package com.example.primerparciallabov;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.List;

public class OnClickEditarListener implements View.OnClickListener {

    View viewItem; //El view que contiene al boton editar
    MainActivity activity;
    OnClickEditarListener(View viewItem, MainActivity activity){
        this.viewItem = viewItem;
        this.activity = activity;
    }


    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnEditar){
            int index = this.activity.rv.getChildLayoutPosition(this.viewItem);
            UsuarioModel usuario = this.activity.listaUsuarios.get(index);

            Intent intent = new Intent(this.activity,UsuarioActivity.class);
            intent.putExtra("model",usuario);
            intent.putExtra("index",index);
            this.activity.startActivity(intent);
        }
    }
}
