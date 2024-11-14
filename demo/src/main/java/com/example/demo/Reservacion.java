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
@Table(name = "reservaciones", schema = "defaultDB")
@Data
@AllArgsConstructor
@Builder
public class Reservacion {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    // @Column(name = "tipo_id", nullable = true, unique = true)
    Long reservacion_id;

    @Column(name = "dia_inicial",nullable = false, unique = false)
    LocalDate dia_inicial;
    
    @Column(name = "dia_final",nullable = false, unique = false)
    LocalDate dia_final;

    @Column(name = "cant_huespedes",nullable = false, unique = false)
    int cant_huespedes;

    @Column(name = "correo", nullable = true, unique = false)
    String correo;

    // @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "habitacion_id", nullable = false, unique = true)
    long habitacion_id;

    public Reservacion(){
        // this.habitacion_id = 1L;
        // this.numero_de_habitacion = 1;
        // this.estado = "ocupada";
        // this.tipoID = 1;
    }
}
