package com.example.demo;

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
@Table(name = "habitaciones", schema = "defaultDB")
@Data
@AllArgsConstructor
@Builder
public class Habitacion {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    // @Column(name = "tipo_id", nullable = true, unique = true)
    Long habitacion_id;

    @Column(name = "numero_de_habitacion",nullable = false, unique = true)
    int numero_de_habitacion;
    
    @Column(name = "estado", nullable = true)
    String estado;

    // @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "tipo_id", nullable = false, unique = true)
    long tipo_id;

    public Habitacion(){
        this.habitacion_id = 1L;
        this.numero_de_habitacion = 1;
        this.estado = "ocupada";
        // this.tipoID = 1;
    }
}