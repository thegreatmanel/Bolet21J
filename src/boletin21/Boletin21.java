/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21;

/**
 *
 * @author propa
 */
public class Boletin21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Leer le = new Leer();
        le.mostrarLista("archivo.txt");
        le.engadir("archivo.txt");
    }
    }
    

