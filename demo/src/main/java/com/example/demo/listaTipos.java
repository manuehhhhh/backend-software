package com.example.demo;
import javax.annotation.PostConstruct;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface listaTipos extends JpaRepository<TipoHabitacion, Long> {
    @PostConstruct
    private void init(){
        System.out.println("akldfhkla");
        this.save(new TipoHabitacion());
        this.save(new TipoHabitacion());
    }
}
