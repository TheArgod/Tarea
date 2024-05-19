package com.tuuniversidad.tarea.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tuuniversidad.tarea.models.Libro;

@Repository
public class LibroRepositoryImpl implements LibroRepository{

    private List<Libro> libros = new ArrayList<>();
    
    public LibroRepositoryImpl(){
        libros.add(new Libro(1000, "Don Quijote de la mancha", "Miguel de Cervantes","Urbano Manini", 1868));
        libros.add(new Libro(1001, "Cien años de soledad", "Gabriel García Márquez", "Editorial Sudamericana", 1967));
        libros.add(new Libro(1002, "El gran Gatsby", "F. Scott Fitzgerald", "Charles Scribner's Sons", 1925));
    }

    @Override
    public Libro getLibro(int id) {
        System.out.println("Conectado a base de datos ORACLE");
        for(Libro libro: libros){
            if(id == libro.getId())
                return libro;

        }
        return null;
    }

    @Override
    public List<Libro> getLibro() {
        System.out.println("Conectado a base de datos ORACLE");
        return libros;
    }

    @Override
    public Libro nuevoLibro(Libro libro) {
        libros.add(libro);
        return libro;
    }
}