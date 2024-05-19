package com.tuuniversidad.tarea.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tuuniversidad.tarea.models.Libro;
import com.tuuniversidad.tarea.service.LibroService;

@RestController
public class LibroController {
    @Autowired
    private LibroService libroService;

    @GetMapping("/hola")
    public String Hola(){
        return "Hola Spring Boot";
    }

    @PostMapping("/libros")
    public Libro nuevoLibro(@RequestBody Libro libro){
        libroService.nuevoLibro(libro);
        return libro;
    }

    @GetMapping("/libros/{id_libro}")
    public Libro getLibro(@PathVariable int id){
        Libro libro = libroService.getLibro(id);
        return libro;
    }

    @GetMapping("/libros")
    public List<Libro> getLibros(){
        return libroService.getLibro();
    }
}
