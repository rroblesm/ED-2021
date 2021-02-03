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
public class Escolar extends DePasajeros {

    boolean lugarProyecto;

    public Escolar() {
        super();
    }

    public Escolar(String marca, String numMotor, String placas, double costoCamion, int totalPasaj, boolean lugarProyecto) {
        super(marca, numMotor, placas, costoCamion, totalPasaj);
        this.lugarProyecto = lugarProyecto;
    }

    public boolean getLugarProyecto() {
        return lugarProyecto;
    }

    public void setLugarProyecto(boolean lugarProyecto) {
        this.lugarProyecto = lugarProyecto;
    }
    
    /*El costo del servicio para los camiones de pasajeros, dedicados al transporte de escolares se
calcula como el 0.01% del costo del camión dividido entre el número de pasajeros,
multiplicado por $250 y eso da el importe mensual que deberá abonar cada niño.*/
    
    public double calculaCostoServicio(){
        return ( (this.getCostoCamion() * (0.01/100))/this.getTotalPasaj() ) * 250;       
    }

    public String toString() {

        String lugarP = "";

        if (lugarProyecto) {
            lugarP = "si";
        } else {
            lugarP = "no";
        }
        return super.toString() + " y  " + lugarP + " cuenta con espacio para que los estudiantes lleven sus proyectos. ";
    }

    
    
    
}
