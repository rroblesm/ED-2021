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
public class Turismo extends DePasajeros {
    
    private boolean asientoCama, serviBar;
    
    public Turismo(){
        super();
    }

    public Turismo(String marca, String numMotor, String placas, double costoCamion, int totalPasaj, boolean asientoCama, boolean serviBar) {
        super(marca, numMotor, placas, costoCamion, totalPasaj);
        this.asientoCama = asientoCama;
        this.serviBar = serviBar;
    }

    public double calculaCostoServicio(double km){
        double aumentoCama = 0, aumentoBar = 0;
        if(serviBar)
            aumentoCama = (5/100);
        if(asientoCama)
            aumentoBar = (5/100);
        
        return (super.calculaCostoServicio(km) ) + (super.calculaCostoServicio(km) * aumentoBar) + ( super.calculaCostoServicio(km) * aumentoCama);
    }

public String toString() {
        String asiCa="", bar="";     
        if (asientoCama)
             asiCa="si";
        else asiCa="no";
        if(serviBar)
            bar="Si";
        else bar="No";          
        return super.toString() + " y  " + asiCa + " cuenta con asientos tipo cama. "+ bar+" tiene servicio de Bar";
    }


    
}
