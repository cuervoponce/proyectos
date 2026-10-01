package ar.com.centro8.java.curso.entidades.banco.cliente;

import lombok.Getter;
import lombok.ToString;

//@Setter no va porque no quiero que las clases hijas modifiquen el atributo de esta clase.
@Getter
@ToString 
public abstract class Cliente {
    private final int nroCliente;//final porque se le asignara un solo valor que no podra ser modificado.

    public Cliente(int nroCliente){
        this.nroCliente = nroCliente;
    }

}