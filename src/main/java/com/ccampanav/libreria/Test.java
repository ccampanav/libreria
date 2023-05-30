/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.ccampanav.libreria;


/**
 *
 * @author core i5
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instantiate 'Buscar' Class and add some 'Libros'
        Buscar buscar = new Buscar();
        buscar.insertLibro(new Libro(1, "Poema de Gilgamesh", "Escrito en Sumeria por Anónimo", 10));
        buscar.insertLibro(new Libro(2, "Libro de Job (de la Biblia)", "Escrito en Imperio aqueménida por Moisés", 20));
        buscar.insertLibro(new Libro(3, "Las mil y una noches", "Escrito en India por Anónimo", 10));
        buscar.insertLibro(new Libro(4, "Saga de Njál", "Escrito en Islandia por Anónimo", 20));
        buscar.insertLibro(new Libro(5, "Todo se desmorona", "Escrito en Nigeria por Chinua Achebe", 10));
        buscar.insertLibro(new Libro(6, "Cuentos infantiles", "Escrito en Dinamarca por Hans Christian Andersen", 20));
        buscar.insertLibro(new Libro(7, "Divina comedia", "Escrito en Italia por Dante Alighieri", 10));
        buscar.insertLibro(new Libro(8, "Orgullo y prejuicio", "Escrito en Reino Unido por Jane Austen", 20));
        buscar.insertLibro(new Libro(9, "Papá Goriot", "Escrito en Francia por Honoré de Balzac", 10));
        buscar.insertLibro(new Libro(10, "Molloy, Malone muere, El Innombrable, una trilogía", "Escrito en Irlanda por Samuel Beckett", 20));
        
        //Tests for search coincidences. The search is in result of getInformacion() of each 'libro' of list
        //The search is not CaseSensitive
        String[] keywords = {"ANÓNIMO", "mOll"};
        try {
            buscar.buscar(keywords).forEach(libro -> {
                System.out.println(">> " + libro.getInformacion());
            }); 
        } catch (Exception e) {
            System.out.println("Excepción: " + e.getMessage());
        }
        
    }
    
}
