package com.testbanco1.testbanco1.modelo;

public class DatosPersonales {
    private String Nombre_Banco;
    private String Numero_Tarjeta;
    private String Titular_Tarjeta;
    private String Fecha_Exp;
    private String CVV;

    public String getNombre_Banco() {
        return Nombre_Banco;
    }

    public void setNombre_Banco(String nombre_Banco) {
        Nombre_Banco = nombre_Banco;
    }

    public String getNumero_Tarjeta() {
        return Numero_Tarjeta;
    }

    public void setNumero_Tarjeta(String numero_Tarjeta) {
        Numero_Tarjeta = numero_Tarjeta;
    }

    public String getTitular_Tarjeta() {
        return Titular_Tarjeta;
    }

    public void setTitular_Tarjeta(String titular_Tarjeta) {
        Titular_Tarjeta = titular_Tarjeta;
    }

    public String getFecha_Exp() {
        return Fecha_Exp;
    }

    public void setFecha_Exp(String fecha_Exp) {
        Fecha_Exp = fecha_Exp;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }
}
