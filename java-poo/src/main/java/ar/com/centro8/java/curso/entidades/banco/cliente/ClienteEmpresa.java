package ar.com.centro8.java.curso.entidades.banco.cliente;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter 
@Getter
@ToString(callSuper = true)//Incluye en el toString los datos de la clase padre, en este caso nroCliente.
public class ClienteEmpresa extends Cliente{
    private String nombreFantasia;
    private String cuit;

    public ClienteEmpresa(int nroCliente, String nombreFantasia, String cuit) {
        super(nroCliente);//Llama al constructor de la clase padre.
        this.nombreFantasia = nombreFantasia;
        this.cuit = cuit;
    }

}