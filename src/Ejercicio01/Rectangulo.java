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
public class Rectangulo {
    private double lado1, lado2;
    
    
    public Rectangulo(){
        lado1 = 10;
        lado2 = 10;
    }
    
    public Rectangulo(double lado1, double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public void setLado1(double lado1){
        this.lado1 = lado1;
    }
    public void setLado2(double lado2){
        this.lado2 = lado2;
    }
    public double getLado1(){
        return lado1;
    }
    public double getLado2(){
        return lado2;
    }
    public boolean equals(Object obj){
        //Use Object y NO Rectangulo, 
        //porque si solo recibiera Rectangulos, no podria usarlo con sus "familiares"        
        //lo propio seria checar instanceOf
        //pero aqui voy a castear con fuerza bruta
        Rectangulo otro = (Rectangulo) obj;        
        return (otro.lado1==this.lado1 && otro.lado2==this.lado2);
    }

    public String toString() {
        return "Rectangulo \n" + "lado1=" + lado1 + ", lado2=" + lado2;
    }
    
    public double calculaArea(){
        return lado1*lado2;
    }
    
    public double calculaPerimetro(){
        return (lado1*2)+(lado2*2);
    }
    
    
    
    
}
