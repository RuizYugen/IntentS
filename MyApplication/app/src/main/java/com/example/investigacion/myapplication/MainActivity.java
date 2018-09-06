package com.example.investigacion.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*public void mostrar(View view){
        Intent intent = new Intent(this, DatosPersonales.class);
        EditText tvAux1,tvAux2,tvAux3,tvAux4,tvAux5;
        tvAux1= findViewById(R.id.eDNombre);
        tvAux2= findViewById(R.id.eDApellidoP);
        tvAux3= findViewById(R.id.eDApellidoM);
        tvAux4= findViewById(R.id.eDEmail);
        tvAux5= findViewById(R.id.eDTelefono);

        Datos d = new Datos(tvAux1.getText().toString(),tvAux2.getText().toString(),tvAux3.getText().toString()
                ,tvAux4.getText().toString(),tvAux5.getText().toString());

        intent.putExtra("dato", d);
        startActivity(intent);
    }*/
    public void mostrar(View view){
        Intent intent=new Intent(this, Main2Activity.class);
        EditText txtNombres=findViewById(R.id.txtNombre);
        EditText txtApellidos=findViewById(R.id.txtApellido);
        EditText txtCorreo=findViewById(R.id.txtCorreo);
        EditText txtTelefono=findViewById(R.id.txtTelefono);
        Contacto contacto=new Contacto(txtNombres.getText().toString(),txtApellidos.getText().toString(),
                txtCorreo.getText().toString(),txtTelefono.getText().toString());
        intent.putExtra("dato",contacto);
        startActivity(intent);
    }

}
