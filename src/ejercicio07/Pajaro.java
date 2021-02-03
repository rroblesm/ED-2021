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
public class Pajaro implements ObjVolador {
    private boolean enVuelo;
    private String habitat;
    private int clave;
    private static int serie=1;

    public Pajaro(){
        clave = serie;
         serie += 1;
    }
    
    public void setHabitat(String habitat){
        this.habitat = habitat;
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
