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
        double aumento = 0;
        if(serviBar)
            aumento += (5/100);
        if(asientoCama)
            aumento += (5/100);
        
        return (super.calculaCostoServicio(km) ) + (super.calculaCostoServicio(km) * aumento);
    }

    public boolean getAsientoCama() {
        return asientoCama;
    }

    public void setAsientoCama(boolean asientoCama) {
        this.asientoCama = asientoCama;
    }

    public boolean getServiBar() {
        return serviBar;
    }

    public void setServiBar(boolean serviBar) {
        this.serviBar = serviBar;
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
