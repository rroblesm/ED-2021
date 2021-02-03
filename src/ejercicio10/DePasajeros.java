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
public class DePasajeros extends Camion {
    private int totalPasaj;
    
    public DePasajeros(){
        super();
    }
    public DePasajeros(String marca, String numMotor, String placas, int totalPasaj){
        super(marca, numMotor, placas);
        this.totalPasaj = totalPasaj;
    }

    public int getTotalPasaj() {
        return totalPasaj;
    }

    public void setTotalPasaj(int totalPasaj) {
        this.totalPasaj = totalPasaj;
    }
    
    
    public String toString() {
        return super.toString() + " con capacidad de " + totalPasaj + " pasajeros";
    }

    
    

    
}
