package ar.com.centro8.java.curso.entidades.banco.cuenta;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter 
@Getter 
@ToString 
@AllArgsConstructor
public class Cheque {
    private float monto;
    private String bancoEmisor;
    private LocalDate fechaPago;//Para mostrar una fecha es mas apropiado usar LocalDate como tipo de dato.

}