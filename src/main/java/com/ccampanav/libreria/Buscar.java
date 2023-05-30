/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ccampanav.libreria;

//import org.biblioteca.interfaces.Buscar;  //this line cause error for same name 'Buscar'
import org.biblioteca.interfaces.Libro;
import org.biblioteca.excepciones.LibroNoEncontradoException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author core i5
 */
public class Buscar implements org.biblioteca.interfaces.Buscar {
    private List<Libro> libros;
    
    public Buscar() {
        libros = new ArrayList<>();
    }
    
    //Getters && Setters
    
    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
    
    public List<Libro> getLibros() {
        return this.libros;
    }
    
    //Methods
    
    public void insertLibro(Libro libro) {
        this.libros.add(libro);
    }
    
    public List<Libro> buscar(String[] strings) throws Exception {
        List<Libro> libros_filtrados = new ArrayList<>();
        if (strings != null && strings.length > 0) {
            if (!this.libros.isEmpty()) {
                this.libros.forEach(libro -> {               
                    int s;
                    for (s = 0; s < strings.length; s++) {
                        if (libro.getInformacion().toLowerCase().indexOf(strings[s].toLowerCase()) > -1) {
                            libros_filtrados.add(libro);
                        }
                    }
                });
                //
                if (libros_filtrados.isEmpty()) {
                    throw new LibroNoEncontradoException("Error. No hay coincidencias.");
                }
            } else {
                throw new LibroNoEncontradoException("Error. No hay libros.");
            }
        } else {
            throw new LibroNoEncontradoException("Error. No hay palabras clave.");
        }
        return libros_filtrados;
    }
}
