package ar.com.centro8.java.curso.tests;

import static ar.com.centro8.java.curso.tests.TestCliente.raven;

import java.time.LocalDate;

import ar.com.centro8.java.curso.entidades.banco.cuenta.CuentaCorriente;
import ar.com.centro8.java.curso.entidades.banco.cuenta.Cheque;

public class TestCuentaCorriente {
   
   public static void main(String[] args) {
      CuentaCorriente cuentaRaven= new CuentaCorriente(7, raven, "ARS", -50000);
      
      System.out.println("El saldo es: $" + cuentaRaven.getSaldo());
      float monto = 9000;
      cuentaRaven.depositar(monto);

      //Función de cheque
      Cheque cheque = new Cheque(7000, "Banco1", LocalDate.of(2026, 04, 01));
      cuentaRaven.depositarCheque(cheque);
      System.out.println("Se acreditaron: $" + cuentaRaven.getSaldo());
      
      cuentaRaven.extraer(100000);
      System.out.println("El saldo es: $" + cuentaRaven.getSaldo());
      
      System.out.println("Se acreditaron: $" + monto);
      System.out.println("El saldo es: $" + cuentaRaven.getSaldo());
   }  
}