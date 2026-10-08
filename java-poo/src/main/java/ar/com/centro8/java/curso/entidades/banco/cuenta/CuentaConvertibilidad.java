package ar.com.centro8.java.curso.entidades.banco.cuenta;

import ar.com.centro8.java.curso.entidades.banco.cliente.ClienteEmpresa;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter 
@Getter 
@ToString(callSuper = true)
public class CuentaConvertibilidad extends CuentaCorriente{
    private float saldoDolares;

    public CuentaConvertibilidad(int nroCuenta, ClienteEmpresa cliente, String moneda, float montoDescubierto, float saldoDolares) {
        super(nroCuenta, cliente, moneda, montoDescubierto);
        this.saldoDolares = saldoDolares;
    }

    public void depositarDolares(float monto) {
       if(monto>0) saldoDolares += monto;
    // Si el monto es mayor a 0, lo suma al saldo actual en dólares.
       else System.out.println("Monto inválido");
    }

    public void extraerDolares(float monto) {
        if(monto>0 && monto <= saldoDolares) saldoDolares -= monto;
    // Si el monto es mayor a 0 y no supera el saldo en dólares, lo resta del saldo actual en dólares.
        else System.out.println("Monto inválido o saldo insuficiente");
    }

    public void convertirPesos(float monto, float tasaConversion){
        if(monto>0 && monto <= saldo && tasaConversion >0) {
            saldo -= monto; saldoDolares += monto/tasaConversion;
        }
    // Si el monto es positivo, no supera el saldo en pesos y la tasa es válida, descuenta los pesos y suma su equivalente en dólares.
        else System.out.println("No se puede realizar la conversión");
    }

    public void convertirDolares(float monto, float tasaConversion){
        if (monto > 0 && monto <= saldoDolares && tasaConversion > 0) {
            saldoDolares -= monto; saldo += monto * tasaConversion;
        }
    // Si el monto es positivo, no supera el saldo en dólares y la tasa es válida, descuenta los dólares y suma su equivalente en pesos.
        else System.out.println("No se puede realizar la conversión");
    }
}