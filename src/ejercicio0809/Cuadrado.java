/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio0809;

/**
 *
 * @author R
 */
public class Cuadrado extends Cuadrilatero {
    
    public Cuadrado(double lado1){
        setLado1(lado1);
        setLado2(lado1);
    }
    
    
    public String toString() {
        return "Cuadrado con lado " + getLado1();
    }

    
}
