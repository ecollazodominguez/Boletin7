/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_1;

/**
 *
 * @author ecollazodominguez
 */
public class Boletin7_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1 = new Libro("El amor prohibido","Jose Camacho",8,5);
        Libro libro2 = new Libro("No mires atrás","Rafa Aguiar",0,8);
        Libro libro3 = new Libro();
        libro3.setTitulo("Programación Avanzada");
        libro3.setAutor("Sergio Rodriguez");
        libro3.setExemplares(10);
        libro3.setPrestados(0);
        
        libro1.prestamo();
        libro2.prestamo();
        libro3.devolucion();
    }
    
}
