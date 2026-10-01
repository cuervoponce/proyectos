package ar.com.centro8.java.curso.entidades.banco;

import  java.util.ArrayList;
import java.util.List;

import ar.com.centro8.java.curso.entidades.banco.cliente.Cliente;
import ar.com.centro8.java.curso.entidades.banco.cuenta.Cuenta;
import lombok.Getter;

@Getter
public class SistemaBancario{
    
    //Estas lineas crean respectivas listas para guardar objetos de tipo Cliente y Cuenta.
    //new ArrayList<>() crea la lista vacía, para almacenarlas.
    private List<Cliente> registroCliente = new ArrayList<>();
    private List<Cuenta> registroCuenta = new ArrayList<>();

    public  void registrarCliente(Cliente cliente){
        registroCliente.add(cliente);
    }

    public void registrarCuenta(Cuenta cuenta){
        registroCuenta.add(cuenta);
    }
}