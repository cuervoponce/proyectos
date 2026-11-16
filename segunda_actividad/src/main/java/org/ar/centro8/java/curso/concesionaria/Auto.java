package org.ar.centro8.java.curso.concesionaria;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
//@ToString no lo utilizamos porque necesitamos una salida personalizada, exactamente como pide la consigna.
//Auto hereda de la clase abstracta Vehiculo.
public class Auto extends Vehiculo{

    private int puertas;

    public Auto(String marca, String modelo, double precio, int puertas){
        super(marca, modelo, precio);
        this.puertas = puertas;
    }
    
    //Implementa el método de la interfaz Informacion.
    //Personaliza la salida por consola respetando el formato solicitado para los autos.
    @Override 
    public String mostrarDatos(){
        //Esto nos permite controlar exactamente cómo se imprime el vehículo.
        return "Marca: " + marca
                + " // Modelo: " + modelo
                + " // Puertas: " + puertas
                + " // Precio: " + formatoPrecio();
    }
}