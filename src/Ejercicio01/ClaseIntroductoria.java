/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio01;

/**
 *
 * @author R
 */
public class ClaseIntroductoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ComplejoVacacional clubPenguin = new ComplejoVacacional("Club Penguin");
        
        clubPenguin.altaAlberca(6,3);
        clubPenguin.altaAlberca(5,5);
        System.out.println("Lona total: " + clubPenguin.calculaLona());
        System.out.println("Cerca total: " + clubPenguin.calculaCerca());        

    }
    
}
