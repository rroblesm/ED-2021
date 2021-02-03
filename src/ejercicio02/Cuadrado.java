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



public class Cuadrado {
    private double lado;
    
    public Cuadrado(){
        this.lado = 25;
    }    
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

    public boolean equals(Object obj) {
        Cuadrado otro = (Cuadrado) obj;
        return otro.lado == this.lado;
    }
    
    public String toString() {
        return "Este cuadrado tiene un lado de tamaño: " + lado;
    }
   
    public double calculaArea(){
        return lado * lado;
    }
    public double calculaPerimetro(){
        return lado*4;
    }
    
    
    
    
    


    
    
    
}
