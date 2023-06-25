package entities;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;   

abstract class Vehiculo implements Comparable<Vehiculo> {
    private String marca;
    private String modelo;
    private double precio;

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public abstract String getDetalle();

    @Override
    public int compareTo(Vehiculo otroVehiculo) {
        return Double.compare(otroVehiculo.getPrecio(), this.getPrecio());
    }

    @Override
    public String toString() {
        DecimalFormat formatoPrecio = new DecimalFormat("$#,###,##0.00");
        return "Marca: " + marca + " // Modelo: " + modelo + " // " + getDetalle() + " // Precio: " + formatoPrecio.format(precio);
    }
}

    

