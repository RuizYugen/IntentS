package com.example.investigacion.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        /*
    * Datos datos = (Datos) getIntent().getExtras().getParcelable("dato");
        String auxString = datos.getNombre();
        TextView aux = findViewById(R.id.tVNom);
        aux.setText("Nombre: " + auxString);

        auxString = datos.getApellidoMaterno();
        aux = findViewById(R.id.tVApMat);
        aux.setText("Apellido Materno: " + auxString);

        auxString = datos.getApelledoPaterno();
        aux = findViewById(R.id.tVApePat);
        aux.setText("Apellido Paterno: " + auxString);

        auxString = datos.getEmail();
        aux = findViewById(R.id.tVEmail);
        aux.setText("Email: " + auxString);

        auxString = datos.getTelefono();
        aux = findViewById(R.id.tVPhone);
        aux.setText("Telefono: " + auxString);
    * */
        Contacto datos=(Contacto) getIntent().getExtras().getParcelable("dato");
        TextView aux = findViewById(R.id.lblDatos);
        aux.setText(datos.toString());

    }

}
