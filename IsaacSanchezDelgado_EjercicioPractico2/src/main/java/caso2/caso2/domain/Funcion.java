/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package caso2.caso2.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import lombok.Data;

@Data
@Entity
@Table(name="funcion")
public class Funcion implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_funcion")
    private Long idFuncion;

    private String titulo;
    private String director;
    
    @Column(name="duracion_min")
    private Integer duracionMin;
    
    private LocalDate fecha;
    private LocalTime hora;
    private Double precio;
    
    @Column(name="asientos_disponibles")
    private Integer asientosDisponibles;
    
    private boolean activo;

    public Funcion() {
    }

    public Funcion(String titulo, String director, Integer duracionMin, LocalDate fecha, 
                  LocalTime hora, Double precio, Integer asientosDisponibles, boolean activo) {
        this.titulo = titulo;
        this.director = director;
        this.duracionMin = duracionMin;
        this.fecha = fecha;
        this.hora = hora;
        this.precio = precio;
        this.asientosDisponibles = asientosDisponibles;
        this.activo = activo;
    }
}
