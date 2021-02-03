/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;

/**
 *
 * @author R
 */
public class Alumno {
    private static int serie = 100;
    private int claveUnica;
    private String nombreAlum;
    private double[] califMateriaAprob;
    private int totalCalifAprob;
    private static final int MAX_CALIF=50;
    
    public Alumno(){
        califMateriaAprob = new double[MAX_CALIF];
        totalCalifAprob = 0;
        claveUnica = serie;
        serie += 1;
    }
    
    public Alumno(String nombreAlum){
        this();
        this.nombreAlum = nombreAlum;
    }
    
    public boolean altaCalificacion(double calificacion){
        boolean resp=false;
        if(calificacion>=6){
            califMateriaAprob[totalCalifAprob]= calificacion;
            totalCalifAprob++;
            resp=true;
        }
        return resp;
    }
    
    public String getNombreAlum(){
        return this.nombreAlum;
    }
    
    public int getTotalCalifAprob(){
        return this.totalCalifAprob;
    }
    
    public int getClave(){
        return this.claveUnica;
    }
        
    public double calculaPromedio(){
        int i, promedio = 0;
        for(i=0; i<totalCalifAprob; i++){
            promedio += califMateriaAprob[i];
        }       
        return (promedio / i);
        
        //¿Deberia poner un if en caso de que no tenga calificaciones subidas?
    }

    public boolean equals(Object obj){
        Alumno otro = (Alumno) obj;
        return ( this.claveUnica == otro.claveUnica && this.nombreAlum.equalsIgnoreCase(otro.nombreAlum) );
    }

    public String toString(){
        
        return "Nombre: " + this.nombreAlum 
             + "\nClave: " + this.claveUnica 
             + "\nMaterias Aprobadas: " + this.totalCalifAprob 
             + "\nPromedio: " + this.calculaPromedio();

    }    

}
