package com.gus.datoscontacto;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

public class SolicitudDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitud_datos);

        botonSiguiente();
    }

    public void botonSiguiente(){
        Button btnSig = (Button) findViewById(R.id.btnSiguiente);
        btnSig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextInputEditText itNombre = (TextInputEditText) findViewById(R.id.itNombre);
                DatePicker dpFnac = (DatePicker) findViewById(R.id.dpFnac);
                int mes  = dpFnac.getMonth() + 1;
                TextInputEditText itTel = (TextInputEditText) findViewById(R.id.itTel);
                TextInputEditText itMail = (TextInputEditText) findViewById(R.id.itMail);
                TextInputEditText itDesc = (TextInputEditText) findViewById(R.id.itDesc);

                Intent intent = new Intent(SolicitudDatos.this, ConfirmarDatos.class);

                intent.putExtra("pNombre", itNombre.getText().toString());
                intent.putExtra("pFnac", dpFnac.getDayOfMonth() + "/" + mes + "/" + dpFnac.getYear());
                intent.putExtra("pTel", itTel.getText().toString());
                intent.putExtra("pMail", itMail.getText().toString());
                intent.putExtra("pDescr", itDesc.getText().toString());

                startActivity(intent);
            }
        });
    }
}
