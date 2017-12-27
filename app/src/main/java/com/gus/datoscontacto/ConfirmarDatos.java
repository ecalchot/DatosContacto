package com.gus.datoscontacto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmarDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        botonEditar();

        Bundle parametros = getIntent().getExtras();

        String nombre = parametros.getString("pNombre");
        String fnac   = parametros.getString("pFnac");
        String tel    = parametros.getString("pTel");
        String mail   = parametros.getString("pMail");
        String descr  = parametros.getString("pDescr");

        TextView tvNombre   = (TextView) findViewById(R.id.txtConfNombreContacto);
        TextView tvFnac     = (TextView) findViewById(R.id.txtConfFnacValor);
        TextView tvTelefono = (TextView) findViewById(R.id.txtConfTelValor);
        TextView tvEmail    = (TextView) findViewById(R.id.txtConfEmailValor);
        TextView tvDescr    = (TextView) findViewById(R.id.txtConfDescValor);

        tvNombre.setText(nombre);
        tvFnac.setText(fnac);
        tvTelefono.setText(tel);
        tvEmail.setText(mail);
        tvDescr.setText(descr);
    }

    public void botonEditar(){
        Button btnEditar = (Button) findViewById(R.id.btnEditDatos);
        btnEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
