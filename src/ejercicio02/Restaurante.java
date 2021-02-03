/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

/**
 *
 * @author R
 */
public class Restaurante {
    private String nombre;
    private int numMesas;
    private Cuadrado mesas[];
    private static int MAX = 25;

    public Restaurante() {
        this.mesas = new Cuadrado[MAX];
        numMesas = 0;
    }

    public Restaurante(String nombre) {
        this.mesas = new Cuadrado[MAX];
        numMesas = 0;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumMesas() {
        return numMesas;
    }
    
    
    public String obtenerMesaEspecifica(int lugar){
         String devolucion = "Esta mesa tiene un lado de " + mesas[lugar].getLado() + " y un area de " + mesas[lugar].calculaArea();
         return devolucion;
    }
    
    
    
    public boolean altaMesas(double lado){
        boolean respuesta = false;
        if(numMesas < MAX){
            mesas[numMesas] = new Cuadrado(lado);
            numMesas++;
            respuesta = true;
        }
        return respuesta;
    }    
    
    public double calcularManteles(){
        double sumaManteles = 0;        
        for(int i=0; i < numMesas; i++){
            sumaManteles += mesas[i].calculaArea();
        }
        return sumaManteles;
    }
            
            
    public double calcularPuntillas(){
        double sumaPuntillas = 0;        
        for(int i=0; i < numMesas; i++)
            sumaPuntillas += mesas[i].calculaPerimetro();
        
        return sumaPuntillas;        
    }        

    public String toString() {
        return "El Restaurante " + nombre + " tiene " + numMesas + " mesas";
    }
    
    
}
