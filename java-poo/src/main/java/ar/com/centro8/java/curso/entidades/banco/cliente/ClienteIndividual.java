package ar.com.centro8.java.curso.entidades.banco.cliente;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class ClienteIndividual extends Cliente{
    private String nombre;
    private String apellido;
    private String dni;

    public ClienteIndividual(int nroCliente, String nombre, String apellido, String dni) {
        super(nroCliente);
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
}