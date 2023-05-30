/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ccampanav.libreria;

//import org.biblioteca.interfaces.Libro; //this line cause error for same name 'Libro'
/**
 *
 * @author core i5
 */
public class Libro implements org.biblioteca.interfaces.Libro{
    private int id, unidades_disponibles;    
    private String titulo, descripcion;
    
    public Libro(int id, String titulo, String descripcion, int unidades_disponibles) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.unidades_disponibles = unidades_disponibles;
    }
    
    //Getters & Setters
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setUnidadesDisponibles(int unidades_disponibles) {
        this.unidades_disponibles = unidades_disponibles;
    }
    
    //Methods
    
    public String getInformacion() {
        return this.titulo + " (" + this.descripcion + ") - " + this.unidades_disponibles + " unidades disponibles. (" + this.id + ")";
    }
}
