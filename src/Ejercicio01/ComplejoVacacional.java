/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio01;

/**
 *
 * @author R
 */
public class ComplejoVacacional {
    private String nombre;
    private Rectangulo albercas[];
    private int numA;
    private int MAX=10;
    //numA es el numero de albercas que tengo en este momento
    //MAX es el maximo de albercas que tengo en este momento
    
    //Si declaras arriba, tienes que usarlos
    //Si se te ocurre otro nombre y lo declaras en el constructor, no se va a guardar
    //ESA ES LA DIFFERENCIA ENTRE ATRIBUTOS Y VARIABLES LOCALES

    public ComplejoVacacional(){
        nombre = "Prueba";
        albercas = new Rectangulo[MAX];
        numA=0;
    }
    
    //Hay que evitar pasar arreglos previamente generados
    //Quien lo haya construido tiene la direccion de ese arreglo
    public ComplejoVacacional(String nombre){
    //pudieras directamente invocar

        this.nombre = nombre;
        albercas = new Rectangulo[MAX];
        numA = 0;
    }
    
    public String getAlberca(int id){
       return albercas[id].toString();
    }
    
    public int getNumAlbercas(){
       return albercas.length;
    }
    
    public boolean altaAlberca(double lado1, double lado2){
        boolean siSePudo = false;
        if (numA < MAX){//albercas.length
            albercas[numA] = new Rectangulo(lado1, lado2);
            numA++;
            siSePudo = false;
        }
        return siSePudo;            
    }
        
    
    
    //metros de Area
    public double calculaLona(){
        double sumaLona = 0;
        int i;

        for(i=0; i < numA; i++)
            sumaLona += albercas[i].calculaArea();
        
        return sumaLona;

    }
    
    //metros de Perimetro
    public double calculaCerca(){
        double sumaCerca = 0;
        int i;

        for(i=0; i < numA; i++)
            sumaCerca += albercas[i].calculaPerimetro();
        
        return sumaCerca;

    }   

}