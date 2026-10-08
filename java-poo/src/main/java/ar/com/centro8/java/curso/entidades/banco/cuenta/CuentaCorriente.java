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

    public CuentaCorriente(int nroCuenta, Cliente cliente, String moneda, float montoDescubierto) {
        super(nroCuenta, cliente, moneda);
        this.montoDescubierto = montoDescubierto;
    }

    @Override
    public void depositar(float monto) {
        if(monto>0) this.saldo += monto;
    // Si el monto es mayor a 0, lo suma al saldo actual.
        else System.out.println("Monto inválido");
    }

    @Override
    public void extraer(float monto) {
        if(monto>0 && saldo - monto >= montoDescubierto) this.saldo -= monto;
    // Si el monto es positivo y no supera el límite de descubierto permitido, lo resta del saldo actual.
        else System.out.println("Monto inválido o saldo insuficiente");
    }

    public void depositarCheque(Cheque cheque){
        if(cheque.getMonto()>0) this.saldo += cheque.getMonto();
    // Si el monto del cheque es mayor a 0, lo suma al saldo actual.
        else System.out.println("Monto inválido");
    }
}