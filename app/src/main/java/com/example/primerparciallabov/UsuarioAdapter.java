package com.example.primerparciallabov;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UsuarioAdapter extends RecyclerView.Adapter<UsuarioViewHolder> {
    MainActivity activity;
    public UsuarioAdapter(MainActivity activity){
        this.activity = activity;
    }

    @NonNull
    @Override
    public UsuarioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new UsuarioViewHolder(v,new OnClickEditarListener(v,this.activity));
    }

    @Override
    public void onBindViewHolder(@NonNull UsuarioViewHolder holder, int position) {
        UsuarioModel model = this.activity.listaUsuarios.get(position);
        holder.tvTipo.setText(model.getTipoUsuario());
        holder.tvNombre.setText(model.getNombre());
    }

    @Override
    public int getItemCount() {
        return this.activity.listaUsuarios.size();
    }
}
