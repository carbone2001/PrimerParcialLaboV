package com.example.primerparciallabov;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class UsuarioView {
    private UsuarioModel model;
    private UsuarioController controller;
    private EditText etNombre;
    private EditText etContraseña;
    private EditText etContraseñaRepetida;
    private RadioGroup rgTipoUsuario;
    private Button btnGuardar;
    private Activity activity;

    public UsuarioView(UsuarioActivity activity,UsuarioModel model){
        this.model = model;
        this.etNombre = activity.findViewById(R.id.etNombre);
        this.etContraseña = activity.findViewById(R.id.etContraseña);
        this.etContraseñaRepetida = activity.findViewById(R.id.etContraseñaRepetida);
        this.rgTipoUsuario = activity.findViewById(R.id.rgTipoUsuario);
        this.btnGuardar = activity.findViewById(R.id.btnGuardar);
        this.activity = activity;
    }

    public void setController(UsuarioController controller) {
        this.controller = controller;
        this.btnGuardar.setOnClickListener(controller);

    }

    public void mostrarModel(){
        this.etNombre.setText(this.model.getNombre());
        this.etContraseña.setText(this.model.getContraseña());
        this.etContraseñaRepetida.setText(this.model.getContraseña());
        this.activity.getString(R.string.administrador);
        if(this.model.getTipoUsuario().equals(this.activity.getString(R.string.administrador)))
        {
            this.rgTipoUsuario.check(R.id.rdAdministrador);
        }
        else if(this.model.getTipoUsuario().equals(this.activity.getString(R.string.usuario))) {
            this.rgTipoUsuario.check(R.id.rdUsuario);
        }
    }

    public void guardarModel(){
        this.model.setNombre(this.etNombre.getText().toString());
        this.model.setContraseña(this.etContraseña.getText().toString());
        this.model.setTipoUsuario((((RadioButton)this.activity.findViewById(this.rgTipoUsuario.getCheckedRadioButtonId())).getText().toString()));
    }

    public EditText getEtContraseñaRepetida() {
        return etContraseñaRepetida;
    }
}
