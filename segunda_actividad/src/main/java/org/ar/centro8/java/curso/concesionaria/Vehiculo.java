package org.ar.centro8.java.curso.concesionaria;

import org.ar.centro8.java.curso.iterfaz.Informacion;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Vehiculo implements Informacion, Comparable<Vehiculo>{
    //Implementa la interfaz Informacion.
    //También implementa Comparable para establecer el orden natural de los vehículos.
    //Es protected porque lo utilizamos para que Auto y Moto puedan acceder a los atributos heredados de Vehiculo.
    protected String marca;
    protected String modelo;
    protected double precio;
    
    //Método auxiliar para dar formato al precio.
    //Lo utilizan Auto y Moto para mostrar su información.
    protected String formatoPrecio(){
        return String.format(java.util.Locale.of("es", "AR"),
        "$%,.2f", precio);
    }

    //Define el orden natural de los vehículos:
    //primero por marca, después por modelo y finalmente por precio.
    @Override
    public int compareTo(Vehiculo otroVehiculo){
        int resultado = this.marca.compareTo(otroVehiculo.marca);
            if(resultado == 0){
                resultado = this.modelo.compareTo(otroVehiculo.modelo);
            }
            if(resultado == 0){
                resultado = Double.compare(this.precio, otroVehiculo.precio);
            }
        return resultado;
    }

    //Sobrescribe toString().
    //Utiliza mostrarDatos() para obtener la información personalizada de cada tipo de vehículo.
    public String toString(){
        return mostrarDatos();
    }
}