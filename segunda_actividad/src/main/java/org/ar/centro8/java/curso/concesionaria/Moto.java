package org.ar.centro8.java.curso.concesionaria;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
//Moto también hereda de la clase abstracta Vehiculo.
public class Moto extends Vehiculo{

    private int cilindrada;

    public Moto(String marca, String modelo, double precio, int cilindrada){
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    //Implementa el método de la interfaz Informacion.
    //Personaliza la salida por consola respetando el formato solicitado para las motos.
    @Override 
    public String mostrarDatos(){
        //Esto nos permite controlar exactamente cómo se imprime el vehículo.
        return "Marca: " + marca
                + " // Modelo: " + modelo
                + " // Cilindrada: " + cilindrada + "c"
                + " // Precio: " + formatoPrecio();
    }
}