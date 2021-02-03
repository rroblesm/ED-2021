/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Objects;

/**
 *
 * @author R
 */
public abstract class Camion {
    private String marca, numMotor, placas;
    
    public Camion(){
        
    }
    
    public Camion(String marca, String numMotor, String placas){
        this.marca = marca;
        this.numMotor = numMotor;
        this.placas = placas;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getNumMotor() {
        return numMotor;
    }
    public void setNumMotor(String numMotor) {
        this.numMotor = numMotor;
    }
    public String getPlacas() {
        return placas;
    }
    public void setPlacas(String placas) {
        this.placas = placas;
    }

    
    
    public boolean equals(Object obj) {
        Camion otro = (Camion) obj;
        return this.placas.equalsIgnoreCase(otro.placas);
    }

    public String toString() {
        return "Camion con placas: " + placas ;
    }
    
    
    
    
    
}
