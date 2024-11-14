package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import java.io.*; 
import java.util.*;
import org.springframework.http.HttpStatus;


@RestController
public class controladorHabitacion {

    @Autowired
    private listaHabitaciones Habitaciones;

    @Autowired
    private listaTipos TipoDeHabitacion;

    @Autowired
    private listaReservaciones Reservaciones;

    @Autowired
    private listaHospedajes Hospedajes;

    @Autowired
    private listaHuespedes Huespedes;

    @Autowired
    private listaEmpleados Empleados;

    @GetMapping("gestionHabitacion/consultar")
    public @ResponseBody List<Habitacion> listaHabitaciones(){
        return Habitaciones.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("gestionHabitacion/crear")
    public void maslista(@RequestBody Habitacion hab){
        System.out.println(hab.toString());
        this.Habitaciones.save(hab);
    }

    @PutMapping("gestionHabitacion/editar/{ID}")
    public void cambioLista(@PathVariable Long ID, @RequestBody Habitacion nuevo){
        this.Habitaciones.deleteById(ID);
        this.Habitaciones.save(nuevo);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping({"gestionHabitacion/eliminar/{ID}"})
    public void eliminarElemento(@PathVariable Long ID){
        this.Habitaciones.deleteById(ID);
    }

    //CRUD tipos de habitacion

    @GetMapping("/gestionTipos/consultar")
    public @ResponseBody List<TipoHabitacion> listaTiposHabitaciones(){
        return TipoDeHabitacion.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/gestionTipos/crear")
    public void maslistaTipos(@RequestBody TipoHabitacion habs){
        System.out.println(TipoDeHabitacion.toString());
        this.TipoDeHabitacion.save(habs);
    }

    @PutMapping("/gestionTipos/editar/{ID}")
    public void cambioListaTipo(@PathVariable Long ID, @RequestBody TipoHabitacion nuevo){
        this.TipoDeHabitacion.deleteById(ID);
        this.TipoDeHabitacion.save(nuevo);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping({"/gestionTipos/eliminar/{ID}"})
    public void eliminarElementoTipo(@PathVariable Long ID){
        this.TipoDeHabitacion.deleteById(ID);
    }


    //CRUD Reservas

    @GetMapping("/gestionReservas/consultar")
    public @ResponseBody List<Reservacion> listaReservaciones(){
        return Reservaciones.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/gestionReservas/crear")
    public void maslistaReservaciones(@RequestBody Reservacion reserv){
        System.out.println(TipoDeHabitacion.toString());
        this.Reservaciones.save(reserv);
    }

    @PutMapping("/gestionReservas/editar/{ID}")
    public void cambioListaReservaciones(@PathVariable Long ID, @RequestBody Reservacion nuevo){
        this.Reservaciones.deleteById(ID);
        this.Reservaciones.save(nuevo);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping({"/gestionReservas/eliminar/{ID}"})
    public void eliminarElementoReservaciones(@PathVariable Long ID){
        this.Reservaciones.deleteById(ID);
    }

    //CRUD Hospedajes

    @GetMapping("/gestionHospedajes/consultar")
    public @ResponseBody List<Hospedaje> listaHospedaje(){
        return Hospedajes.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/gestionHospedajes/crear")
    public void maslistaHospedajes(@RequestBody Hospedaje hosp){
        System.out.println(TipoDeHabitacion.toString());
        this.Hospedajes.save(hosp);
    }

    @PutMapping("/gestionHospedajes/editar/{ID}")
    public void cambioListaHospedajes(@PathVariable Long ID, @RequestBody Hospedaje nuevo){
        this.Hospedajes.deleteById(ID);
        this.Hospedajes.save(nuevo);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping({"/gestionHospedajes/eliminar/{ID}"})
    public void eliminarElementoHospedajes(@PathVariable Long ID){
        this.Hospedajes.deleteById(ID);
    }

    //CRUD Huespedes

    @GetMapping("/gestionHuespedes/consultar")
    public @ResponseBody List<Huesped> listaHuesped(){
        return Huespedes.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/gestionHuespedes/crear")
    public void maslistaHuespedes(@RequestBody Huesped huesp){
        System.out.println(TipoDeHabitacion.toString());
        this.Huespedes.save(huesp);
    }

    @PutMapping("/gestionHuespedes/editar/{ID}")
    public void cambioListaHuespedes(@PathVariable Long ID, @RequestBody Huesped nuevo){
        this.Huespedes.deleteById(ID);
        this.Huespedes.save(nuevo);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping({"/gestionHuespedes/eliminar/{ID}"})
    public void eliminarElementoHuespedes(@PathVariable Long ID){
        this.Huespedes.deleteById(ID);
    }
    

    //CRUD Empleados

    @GetMapping("/gestionEmpleados/consultar")
    public @ResponseBody List<Empleado> listaEmpleado(){
        return Empleados.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/gestionEmpleados/crear")
    public void maslistaEmpleados(@RequestBody Empleado empl){
        System.out.println(TipoDeHabitacion.toString());
        this.Empleados.save(empl);
    }

    @PutMapping("/gestionEmpleados/editar/{ID}")
    public void cambioListaEmpleados(@PathVariable Long ID, @RequestBody Empleado nuevo){
        this.Empleados.deleteById(ID);
        this.Empleados.save(nuevo);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping({"/gestionEmpleados/eliminar/{ID}"})
    public void eliminarElementoEmpleados(@PathVariable Long ID){
        this.Empleados.deleteById(ID);
    }
    

}