/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio07;

/**
 *
 * @author R
 */
public class Avion implements ObjVolador {
    private boolean enVuelo;
    private int numPasajeros;
    private int clave;
    private static int serie=1;

    public Avion (){
        clave = serie;
        serie += 1;
    }
    
    public void setNumPasajeros(int numPasajeros){
        this.numPasajeros = numPasajeros;
    }

    

    
    public void despega() {
        enVuelo = true;
    }

    public void aterriza() {
        enVuelo = false;
    }

    public void seDesplaza() {

    }
    
}
