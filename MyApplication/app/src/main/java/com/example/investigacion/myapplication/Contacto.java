package com.example.investigacion.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class Contacto  implements Parcelable {
    private String Nombres;
    private String Apellidos;
    private String Correo;
    private String Telefono;

    public Contacto(String nombres, String apellidos, String correo,String telefono){
        this.Apellidos=apellidos;
        this.Correo=correo;
        this.Nombres=nombres;
        this.Telefono=telefono;
    }

    public String getNombres(){
        return Nombres;
    }

    public String getApellidos(){
        return Apellidos;
    }

    public String getCorreo(){
        return Correo;
    }
    public String getTelefono(){
        return Telefono;
    }

    @Override
    public String toString(){
        return "Nombre: "+getNombres()+" "+getApellidos()+"\nCorreo: "+getCorreo()+"\nTelefono: "+getTelefono();
    }

    protected Contacto(Parcel in) {
        Nombres = in.readString();
        Apellidos = in.readString();
        Correo = in.readString();
        Telefono = in.readString();

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        //dest.writeString(Nombre);
        dest.writeString(Nombres);
        dest.writeString(Apellidos);
        dest.writeString(Correo);
        dest.writeString(Telefono);
    }

    public static final Creator<Contacto> CREATOR = new Creator<Contacto>() {
        @Override
        public Contacto createFromParcel(Parcel in) {
            return new Contacto(in);
        }

        @Override
        public Contacto[] newArray(int size) {
            return new Contacto[size];
        }
    };
}
