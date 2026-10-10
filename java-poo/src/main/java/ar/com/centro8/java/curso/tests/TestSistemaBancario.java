package ar.com.centro8.java.curso.tests;

import static ar.com.centro8.java.curso.tests.TestCliente.emma;
import static ar.com.centro8.java.curso.tests.TestCliente.raven;

import ar.com.centro8.java.curso.entidades.banco.SistemaBancario;

public class TestSistemaBancario {
    public static void main(String[] args) {
        SistemaBancario banco = new SistemaBancario();

        //null porque la variable existe pero no tiene todavia un objeto asignado.
        banco.registrarCliente(emma);
        banco.registrarCliente(raven);

        System.out.println(banco.getRegistroCliente());

        banco.registrarCuenta(null);
        banco.registrarCuenta(null);

        System.out.println(banco.getRegistroCuenta());
    }
}