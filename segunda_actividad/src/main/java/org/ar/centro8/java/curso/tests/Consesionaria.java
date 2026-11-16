package org.ar.centro8.java.curso.tests;

import java.util.ArrayList;//Importamos ArrayList para crear una lista de vehículos.
import java.util.Collections;//Importamos Collections para ordenar la lista.
import java.util.Comparator;//Importamos Comparator para establecer criterios de comparación.
import java.util.List;//Importamos List para trabajar con una colección de vehículos.
import java.util.Locale;//Importamos Locale para establecer el formato argentino de precios.

import org.ar.centro8.java.curso.concesionaria.Auto;
import org.ar.centro8.java.curso.concesionaria.Moto;
import org.ar.centro8.java.curso.concesionaria.Vehiculo;

public class Consesionaria {

    public static void main(String[] args) {
        
        //Se cargan todos los vehículos llamando a un único método.
        //El método devuelve una lista con todos los vehículos.
        List<Vehiculo> vehiculos = cargarVehiculos();

        //Impresión genérica.
        //Recorre todos los vehículos sin depender de su cantidad o tipo.
        //Utilización de la API Stream:
        //stream() permite recorrer y trabajar con los elementos de la lista.
        //forEach() realiza una acción con cada elemento (vehículo) de la lista.
        //System.out::println imprime cada vehículo.
        //Se utiliza toString() para obtener su información.
        vehiculos.stream().forEach(System.out::println);

        System.out.println("=============================");

        //Stream y Comparator para encontrar el vehículo de mayor precio.
        //VEHÍCULO MÁS CARO:
        //stream() permite recorrer la lista.
        //max() busca el elemento que tiene el valor más alto.
        //Comparator.comparing() compara los vehículos por su precio.
        //Vehiculo::getPrecio indica qué atributo se utiliza para comparar.
        //get() obtiene el vehículo encontrado.
        Vehiculo vehiculoMasCaro = vehiculos
                .stream()
                .max(Comparator.comparing(Vehiculo::getPrecio))
                .get();

        System.out.println("Vehículo más caro: "
                + vehiculoMasCaro.getMarca() + " "
                + vehiculoMasCaro.getModelo()
        );

        //VEHÍCULO MÁS BARATO:
        //min() busca el elemento que tiene el precio más bajo.
        //Comparator.comparing() compara utilizando el precio.
        //get() obtiene el vehículo encontrado.
        Vehiculo vehiculoMasBarato = vehiculos
                .stream()
                .min(Comparator.comparing(Vehiculo::getPrecio))
                .get();
        System.out.println("Vehículo más barato: "
                + vehiculoMasBarato.getMarca() + " "
                + vehiculoMasBarato.getModelo()
        );

        //VEHÍCULO QUE CONTIENE LA LETRA Y:
        //filter() permite filtrar los elementos de la lista.
        //v representa cada vehículo que se está recorriendo.
        //getModelo() obtiene el modelo del vehículo.
        //toLowerCase() convierte el texto a minúsculas.
        //contains("y") comprueba si el modelo contiene la letra y.
        //-> separa el parámetro de la acción que se va a ejecutar.
        //forEach() imprime los vehículos que cumplen la condición.
        vehiculos
                .stream()
                .filter(v -> v.getModelo().toLowerCase().contains("y"))
                .forEach(v -> System.out.println(
                    "Vehículo que contiene en el modelo la letra 'Y': "
                    + v.getMarca() + " "
                    + v.getModelo() + " "
                    + String.format(Locale.of("es", "AR"),
                            "$%,.2f", v.getPrecio())
                ));

        System.out.println("=============================");

        //VEHÍCULOS ORDENADOS POR PRECIO DE MAYOR A MENOR:
        System.out.println("Vehículos ordenados por precio de mayor a menor:");

        //sorted() ordena los vehículos según el criterio indicado.
        //Comparator.comparing() utiliza el precio para comparar.
        //reversed() invierte el orden para mostrar primero el precio mayor.
        //v representa cada vehículo que se imprime.
        vehiculos
                .stream()
                .sorted(Comparator.comparing(Vehiculo::getPrecio).reversed())
                .forEach(v -> System.out.println(
                    v.getMarca() + " " + v.getModelo()
                ));

        System.out.println("=============================");

        //VEHÍCULOS ORDENADOS POR ORDEN NATURAL:
        //Collections.sort() ordena la lista.
        //Utiliza el método compareTo() implementado en Vehiculo.
        //Primero compara la marca, después el modelo y finalmente el precio.
        Collections.sort(vehiculos);

        //Impresión genérica.
        //No depende de la cantidad ni del tipo de vehículos.
        //Imprimimos todos los vehículos con su información completa.
        //toString() devuelve los datos correspondientes a cada vehículo.
        System.out.println("Vehículos ordenados por orden natural (marca, modelo, precio):");

        vehiculos.stream().forEach(System.out::println);
    }

    //Único método encargado de cargar los vehículos. No solicita ningún ingreso por pantalla.
    public static List<Vehiculo> cargarVehiculos(){

        //Utilización del framework Collections mediante una lista ArrayList para almacenar los vehículos.
        //La lista es de tipo Vehiculo porque puede contener objetos Auto y Moto, que heredan de Vehiculo.
        List<Vehiculo> vehiculos = new ArrayList<>();
    
        vehiculos.add(new Auto("Peugeot", "206", 200000, 4));
        vehiculos.add(new Moto("Honda", "Titan", 60000, 125));
        vehiculos.add(new Auto("Peugeot", "208", 250000, 5));
        vehiculos.add(new Moto("Yamaha", "YBR", 80500.50, 160));

        //Devolvemos la lista completa al método main.
        return vehiculos;
    }
}