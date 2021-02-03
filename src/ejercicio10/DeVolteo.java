/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author R
 */
public class DeVolteo extends Camion{
    private double capacidadTon;
    
    public DeVolteo(){
        super();
    }
    public DeVolteo(String marca, String numMotor, String placas, double capacidadTon){
        super(marca, numMotor, placas);
        this.capacidadTon = capacidadTon;
    }

    public double getCapacidadTon() {
        return capacidadTon;
    }

    public void setCapacidadTon(double capacidadTon) {
        this.capacidadTon = capacidadTon;
    }

    
    
    public String toString() {
        return super.toString() + " con capacidad de " + capacidadTon + " toneladas";
    }

    
    
}
