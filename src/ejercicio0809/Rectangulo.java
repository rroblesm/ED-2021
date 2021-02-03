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
public class Rectangulo extends Cuadrilatero{
    
    public Rectangulo(double lado1, double lado2){
        setLado1(lado1);
        setLado2(lado2);
    }

    public String toString() {
        return "Rectangulo con lados " + getLado1() +"," + getLado2();
    }
    
    
    
    
    
}
