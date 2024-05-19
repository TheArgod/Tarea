package com.tuuniversidad.tarea.repository;

import java.util.List;
import com.tuuniversidad.tarea.models.Libro;

public interface LibroRepository {
    Libro getLibro(int id);
    List<Libro> getLibro();
    Libro nuevoLibro(Libro libro);
}
