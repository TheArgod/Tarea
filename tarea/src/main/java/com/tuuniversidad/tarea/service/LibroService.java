package com.tuuniversidad.tarea.service;

import java.util.List;

import com.tuuniversidad.tarea.models.Libro;


public interface LibroService {
    Libro getLibro(int id);
    List<Libro> getLibro();
    Libro nuevoLibro(Libro libro);
}
