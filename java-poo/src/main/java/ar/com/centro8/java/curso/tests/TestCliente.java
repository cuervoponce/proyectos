package ar.com.centro8.java.curso.tests;

import ar.com.centro8.java.curso.entidades.banco.cliente.ClienteEmpresa;
import ar.com.centro8.java.curso.entidades.banco.cliente.ClienteIndividual;

public class TestCliente {
    public static ClienteIndividual emma= new ClienteIndividual(1, "Emma", "Ponce", "24122014");

    public static ClienteEmpresa raven= new ClienteEmpresa(2, "Raven", "01041908");
    
    public static void main(String[] args) {
        System.out.println(emma.getNombre());
        System.out.println(raven.getNombreFantasia());
    }
    
}