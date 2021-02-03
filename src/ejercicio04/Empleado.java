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
public class Empleado {
    private static int serie=100;
    private int claveEmpleado;
    private String nombreEmpleado;
    private double sueldoBase;

    public Empleado() {
        claveEmpleado = serie;
        serie +=1;
    }
    
    public Empleado(String nombreEmpleado, double sueldoBase){
        this();
        this.nombreEmpleado = nombreEmpleado;
        this.sueldoBase = sueldoBase;
    }
    
    public double getSueldoBase(){
        return this.sueldoBase;
    }
    
    public String getNombre(){
        return this.nombreEmpleado;
    }
    
    public void setSueldoBase(double sueldoBase){
        this.sueldoBase = sueldoBase;
    }
    
    public int getClave(){
        return this.claveEmpleado;
    }
    
    public boolean equals(Object obj){
        Empleado otro = (Empleado) obj;
        
        return this.claveEmpleado == otro.claveEmpleado;
    }
    
    public double calculaSalario(double prestaciones, double deducciones){  
        return ( sueldoBase + ( sueldoBase * (prestaciones/100) ) - ( sueldoBase * (prestaciones/100) ) );
    }
    
}
