package ar.com.centro8.java.curso.entidades.banco.cuenta;

import ar.com.centro8.java.curso.entidades.banco.cliente.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter 
@ToString(callSuper = true)
public class CuentaCorriente extends Cuenta{
    private float montoDescubierto;

    public CuentaCorriente(int nroCuenta, Cliente cliente, String moneda, float saldo, float montoDescubierto) {
        super(nroCuenta, cliente, moneda, saldo);
        this.montoDescubierto = montoDescubierto;
    }

    @Override
    public void depositar(float monto) {
        if(monto>0) this.saldo += monto;
        else System.out.println("Monto inválido");
    }

    @Override
    public void extraer(float monto) {
        if(monto>0 && saldo - monto >= montoDescubierto) this.saldo -= monto;
        else System.out.println("Monto inválido o saldo insuficiente");
    }

    public void depositarCheque(float monto){
        if(monto>0) this.saldo += monto;
        else System.out.println("Monto inválido");
    }
    }