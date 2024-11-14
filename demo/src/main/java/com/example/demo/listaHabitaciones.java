package com.example.demo;
import javax.annotation.PostConstruct;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface listaHabitaciones extends JpaRepository<Habitacion, Long> {
    @PostConstruct
    private void init(){
        // System.out.println("akldfhkla");
        // this.save(new Habitacion());
        // this.save(new Habitacion());
    }
}
