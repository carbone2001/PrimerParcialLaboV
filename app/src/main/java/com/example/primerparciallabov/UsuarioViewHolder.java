package com.example.primerparciallabov;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UsuarioViewHolder extends RecyclerView.ViewHolder {
    TextView tvNombre;
    TextView tvTipo;
    Button btnEditar;

    public UsuarioViewHolder(@NonNull View itemView, OnClickEditarListener onClickEditarListener) {
        super(itemView);
        this.tvNombre = itemView.findViewById(R.id.tvNombre);
        this.tvTipo = itemView.findViewById(R.id.tvTipo);
        this.btnEditar = itemView.findViewById(R.id.btnEditar);
        this.btnEditar.setOnClickListener(onClickEditarListener);
    }
}
