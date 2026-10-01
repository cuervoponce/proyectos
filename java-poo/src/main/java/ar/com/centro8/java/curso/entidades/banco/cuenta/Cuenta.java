package ar.com.centro8.java.curso.entidades.banco.cuenta;

import ar.com.centro8.java.curso.entidades.banco.cliente.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public abstract class Cuenta {
    private final int nroCuenta;//Lo mismo que en Cliente, final porque se le asignara un solo valor que no podra ser modificado.
    private final Cliente cliente;//final porque la cuenta solo pertenecera a un solo cliente.
    private String moneda;
    protected float saldo;//protected para que las clases hijas puedan modicar este atributo

    public Cuenta(int nroCuenta, Cliente cliente, String moneda, float saldo) {
        this.nroCuenta = nroCuenta;
        this.cliente = cliente;
        this.moneda = moneda;
        this.saldo = saldo;
    }

    public abstract void depositar(float monto);

    public  abstract void extraer(float monto);

}