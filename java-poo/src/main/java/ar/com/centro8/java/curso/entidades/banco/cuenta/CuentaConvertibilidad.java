package ar.com.centro8.java.curso.entidades.banco.cuenta;

import ar.com.centro8.java.curso.entidades.banco.cliente.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter 
@Getter 
@ToString(callSuper = true)
public class CuentaConvertibilidad extends CuentaCorriente{
    private float saldoDolares;

    public CuentaConvertibilidad(int nroCuenta, Cliente cliente, String moneda, float saldo, float montoDescubierto, float saldoDolares) {
        super(nroCuenta, cliente, moneda, saldo, montoDescubierto);
        this.saldoDolares = saldoDolares;
    }

    public void depositarDolares(float monto) {
       if(monto>0) saldoDolares += monto;
       else System.out.println("Monto inválido");
    }

    public void extraerDolares(float monto) {
        if(monto>0 && monto <= saldoDolares) saldoDolares -= monto;
        else System.out.println("Monto inválido o saldo insuficiente");
    }

    public void convertirPesos(float monto, float tasaConversion){
        if(monto>0 && monto <= saldo && tasaConversion >0) {saldo -= monto;
        saldoDolares += monto/tasaConversion;
        }
        else System.out.println("No se puede realizar la conversión");
    }

    public void convertirDolares(float monto, float tasaConversion){
        if (monto > 0 && monto <= saldoDolares && tasaConversion > 0) {
            saldoDolares -= monto;
            saldo += monto * tasaConversion;
        }
        else System.out.println("No se puede realizar la conversión");
    }

}