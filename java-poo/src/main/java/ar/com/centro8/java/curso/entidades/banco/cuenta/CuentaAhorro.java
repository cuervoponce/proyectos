package ar.com.centro8.java.curso.entidades.banco.cuenta;

import ar.com.centro8.java.curso.entidades.banco.cliente.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter 
@Getter
@ToString(callSuper = true)
public class CuentaAhorro extends Cuenta{
    private float interes;

    public CuentaAhorro(int nroCuenta, Cliente cliente, String moneda, float saldo, float interes) {
        super(nroCuenta, cliente, moneda, saldo);
        this.interes = interes;
    }

    @Override
    public void depositar(float monto){
        if(monto>0) this.saldo += monto;
        else System.out.println("Monto inválido");
    }

    @Override
    public void extraer(float monto){
        if(monto>0 && monto<=saldo) this.saldo -= monto;
        else System.out.println("Monto inválido o saldo insuficiente");

    }

    public void cobrarInteres(){
        if(saldo>0)
            this.saldo += saldo + interes / 100;//// Se divide por 100 porque el interés representa un porcentaje.
    }

}
