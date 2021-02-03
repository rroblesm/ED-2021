/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04;

/**
 *
 * @author R
 */
public class Operario extends Empleado {
    private int horasExtra;
    
    public Operario(){
        super();
        horasExtra=0;
    }
    
    public Operario(String nombreEmpleado, double sueldoBase, int horasExtra){        
        super(nombreEmpleado, sueldoBase);
        this.horasExtra = horasExtra;
    }
    
    public double calculaSalario(double prestaciones, double deducciones, double precioHE){
        double salario = this.getSueldoBase() + ( this.getSueldoBase() * (prestaciones/100) ) +  (horasExtra * precioHE);
        salario = salario - ( salario * (deducciones/100) ) ;
        return salario;
    }

    public String toString() {
        return "Operario:" + this.getNombre() + " tiene:" + horasExtra +"horas Extra";
    }
    
}
