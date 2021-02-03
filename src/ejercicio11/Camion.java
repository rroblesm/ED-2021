/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Objects;

/**
 *
 * @author R
 */
public abstract class Camion {

    private String marca, numMotor, placas;
    private double costoCamion;

    public Camion() {

    }

    public Camion(String marca, String numMotor, String placas, double costoCamion) {
        this.marca = marca;
        this.numMotor = numMotor;
        this.placas = placas;
        this.costoCamion = costoCamion;
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

    public double getCostoCamion() {
        return costoCamion;
    }

    public void setCostoCamion(double costoCamion) {
        this.costoCamion = costoCamion;
    }

    
    
    
    
    
    public boolean equals(Object obj) {
        boolean res = false;
        if (obj != null && obj instanceof Camion) {
            res = ((Camion) obj).placas.equalsIgnoreCase(placas);
        }
        return res;
    }

    public String toString() {
        return " Camión marca:" + marca + " con numero de motor: " + numMotor + " Placas: " + placas + " y con un costo de: $" + costoCamion;
    }

}
