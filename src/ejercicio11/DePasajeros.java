/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

/**
 *
 * @author R
 */
public abstract class DePasajeros extends Camion{
    private int totalPasaj;
    
    public DePasajeros(){
        super();
    }
    public DePasajeros(String marca, String numMotor, String placas, double costoCamion, int totalPasaj){
        super(marca, numMotor, placas, costoCamion);
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
    
    /*
    El costo del servicio para los camiones de pasajeros se calcula como el 0.01% del costo del
camión dividido entre el número de pasajeros y multiplicado por la cantidad de kilómetros
que recorrerá.
    */
    public double calculaCostoServicio(double km){
        return ( ( ( (0.01)/100) * this.getCostoCamion() ) / totalPasaj ) * km ;
    }
    

}
