package ar.com.centro8.java.curso.tests;

import static ar.com.centro8.java.curso.tests.TestCliente.raven;

import ar.com.centro8.java.curso.entidades.banco.cuenta.CuentaConvertibilidad;

public class TestConvertibilidad {
    public static CuentaConvertibilidad cuentaRaven= new CuentaConvertibilidad(8, raven, "ARS", 100000, -50000, 100);
    public static void main(String[] args) {
        
        System.out.println("El saldo en pesos es: $" + cuentaRaven.getSaldo());
        System.out.println("El saldo en dólares es: $" + cuentaRaven.getSaldoDolares());

        //Depositar
        float montoDolares = 100;
        cuentaRaven.depositarDolares(montoDolares);

        System.out.println("Se acreditaron: U$" + montoDolares);
        System.out.println("El saldo en dólares es: U$" + cuentaRaven.getSaldoDolares());


        //Conversión
        float montoPesos = 3000;
        float tasaConversion = 1500;

        cuentaRaven.convertirPesos(montoPesos, tasaConversion);

        System.out.println("El saldo en pesos es: $" +cuentaRaven.getSaldo());
        System.out.println("El saldo en dólares es: $" +cuentaRaven.getSaldoDolares());

    }

}