package ar.com.centro8.java.curso.tests;

import static ar.com.centro8.java.curso.tests.TestCliente.emma;

import ar.com.centro8.java.curso.entidades.banco.cuenta.CuentaAhorro;

public class TestCuentaAhorro {
    public static CuentaAhorro cuentaEmma = new CuentaAhorro(10, emma, "ARS", 0, 15);
    public static void main(String[] args) {
        
        System.out.println("El saldo es: $" + cuentaEmma.getSaldo());

        float monto = 8000;
        cuentaEmma.depositar(monto);

        System.out.println("Se acreditaron: $" + monto);
        System.out.println("El saldo es: $" + cuentaEmma.getSaldo());
        
    }

}