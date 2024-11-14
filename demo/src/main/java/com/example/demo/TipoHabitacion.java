package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tipo_de_habitacion", schema = "defaultDB")
@Data
@AllArgsConstructor
@Builder
public class TipoHabitacion {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long tipo_id;

    @Column(name = "nombre")
    String nombre;
    
    @Column(name = "capacidad_max")
    int capacidad_max;

    @Column(name = "precio_por_noche")
    double precio;

    public TipoHabitacion(){
        this.tipo_id = 1L;
        this.capacidad_max = 1;
        this.nombre = "basica";
        this.precio = 1;
    }
}