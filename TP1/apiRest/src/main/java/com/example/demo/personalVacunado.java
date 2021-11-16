package com.example.demo;

public class personalVacunado{
    private String Autorizado_Por;
    private int Documento_identidad;
    private String Apellido;
    private String Nombre;
    private String Reparticion;
    private String Cargo;
    private String Dosis;
    private String Fecha_Aplicacion;
    private String Lugar_Aplicacion;

    public personalVacunado(String autorizado_Por, int documento_identidad, String apellido, String nombre, String reparticion, String cargo, String dosis, String fecha_Aplicacion, String lugar_Aplicacion) {
       this.Autorizado_Por = autorizado_Por;
        this.Documento_identidad = documento_identidad;
        this.Apellido = apellido;
        this.Nombre = nombre;
        this.Reparticion = reparticion;
        this.Cargo = cargo;
        this.Dosis = dosis;
        this.Fecha_Aplicacion = fecha_Aplicacion;
        this.Lugar_Aplicacion = lugar_Aplicacion;
    }


    public String getAutorizado_Por() {
        return Autorizado_Por;
    }

    public void setAutorizado_Por(String autorizado_Por) {
        this.Autorizado_Por = autorizado_Por;
    }

    public int getDocumento_identidad() {
        return Documento_identidad;
    }

    public void setDocumento_identidad(int documento_identidad) {
        this.Documento_identidad = documento_identidad;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getReparticion() {
        return Reparticion;
    }

    public void setReparticion(String reparticion) {
        this.Reparticion = reparticion;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        this.Cargo = cargo;
    }

    public String getDosis() {
        return Dosis;
    }

    public void setDosis(String dosis) {
        this.Dosis = dosis;
    }

    public String getFecha_Aplicacion() {
        return Fecha_Aplicacion;
    }

    public void setFecha_Aplicacion(String fecha_Aplicacion) {
        this.Fecha_Aplicacion = fecha_Aplicacion;
    }

    public String getLugar_Aplicacion() {
        return Lugar_Aplicacion;
    }

    public void setLugar_Aplicacion(String lugar_Aplicacion) {
        this.Lugar_Aplicacion = lugar_Aplicacion;
    }
}