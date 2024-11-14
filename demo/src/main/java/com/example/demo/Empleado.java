package com.example.demo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "empleados", schema = "defaultDB")
@Data
@AllArgsConstructor
@Builder
public class Empleado {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    // @Column(name = "tipo_id", nullable = true, unique = true)
    Long empleado_id;

    @Column(name = "nombre", nullable = true, unique = false)
    String nombre;

    @Column(name = "rol", nullable = true, unique = false)
    String rol;

    @Column(name = "correo", nullable = true, unique = false)
    String correo;


    public Empleado(){
        // this.habitacion_id = 1L;
        // this.numero_de_habitacion = 1;
        // this.estado = "ocupada";
        // this.tipoID = 1;
    }
}

