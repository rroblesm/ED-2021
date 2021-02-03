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
public class Circulo implements FigGeometrica{
    double radio;
    
    public Circulo(double radio){
        this.radio = radio;
    }
    
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public boolean equals(Object obj) {
        Circulo otro = (Circulo) obj;
        return (this.radio == otro.radio);
    }
    public String toString() {
        return "Circulo con radio: " + radio;
    }
 
    public double calculaArea() {
        return Math.PI * Math.pow( (radio), 2);
    }
    public double calculaPerimetro() {
        return 2 * radio * Math.PI;
    }
    
}
