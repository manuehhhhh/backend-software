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
@Table(name = "huespedes", schema = "defaultDB")
@Data
@AllArgsConstructor
@Builder
public class Huesped {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    // @Column(name = "tipo_id", nullable = true, unique = true)
    Long huesped_id;

    @Column(name = "nombre_completo",nullable = false, unique = false)
    String nombre_completo;

    @Column(name = "cedula",nullable = false, unique = false)
    int cedula;

    @Column(name = "correo", nullable = true, unique = false)
    String correo;

    @Column(name = "hospedaje_id", nullable = true, unique = false)
    long hospedaje_id;

    @Column(name = "reservacion_id", nullable = true, unique = false)
    long reservacion_id;

    public Huesped(){
        // this.habitacion_id = 1L;
        // this.numero_de_habitacion = 1;
        // this.estado = "ocupada";
        // this.tipoID = 1;
    }
}
