/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

/**
 *
 * @author R
 */
public class PracticasDelCuaderno {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Restaurante DeMiRanchoTuCocina = new Restaurante("De Mi Rancho Tu Cocina");
        //nombre de la clase  - nombre del Restaurante
        
        DeMiRanchoTuCocina.altaMesas(2);
        DeMiRanchoTuCocina.altaMesas(5);
        DeMiRanchoTuCocina.altaMesas(3);
        
        System.out.println(DeMiRanchoTuCocina.calcularManteles());        
        
        
    }
    
}
