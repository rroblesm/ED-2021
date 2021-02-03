/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03;

import java.util.ArrayList;


/**
 *
 * @author R
 */
public class Escuela {
    private String nombre, direccion;
    private Alumno[] alumnos;
    private int numAlumnos;
    private static final int MAX_ALUMNOS = 50;
    
    public Escuela(){
        alumnos = new Alumno[MAX_ALUMNOS];
        numAlumnos = 0;        
    }  
    public Escuela(String nombre){
        this();
        this.nombre = nombre;
    }    
    public Escuela(String nombre, String direccion){
        this(nombre);
        this.direccion = direccion;
    }
    
    public boolean altaAlumno(String nombre){
        boolean resp = false;
        if(numAlumnos < MAX_ALUMNOS){
            alumnos[numAlumnos] = new Alumno(nombre);
            numAlumnos++;
            resp = true;
        }
        return resp;      
    }

    public String getAlumno(int clave){
        String datosDeAlumno = "";
        int i = 0;
        
        while(alumnos[i].getClave() != clave && i < numAlumnos){
            i++;
        }
        
        if(alumnos[i].getClave() == clave){
            datosDeAlumno = alumnos[i].toString();
        }
        
        return datosDeAlumno;
    }
    
    public String getAllAlumnos(){
        String AllAlumnos = "";
        
        for (int i=0; i < numAlumnos;i++){
                AllAlumnos.concat("\n Nombre: "+ alumnos[i].getNombreAlum()
                + " Promedio: " + alumnos[i].calculaPromedio() );
        }
        
        return AllAlumnos;              
    }

    public ArrayList<String> obtenerAllAlumnos(){
        ArrayList<String> nombreArrayList = new ArrayList<String>();
        for (int i=0; i < numAlumnos;i++){
            nombreArrayList.add( alumnos[i].getNombreAlum() + ":" + alumnos[i].calculaPromedio());
        }        
        return nombreArrayList;
    }
// Añade el elemento al ArrayList
    // nombreArrayList.add("Elemento");
//Añade el elemento al ArrayList en la posición 'n'
    // nombreArrayList.add(n, "Elemento 2");
// Devuelve el numero de elementos del ArrayList
    // nombreArrayList.size();
// Devuelve el elemento que esta en la posición '2' del ArrayList
    // nombreArrayList.get(2);
// Comprueba se existe del elemento ('Elemento') que se le pasa como parametro
    // nombreArrayList.contains("Elemento");
// Devuelve la posición de la primera ocurrencia ('Elemento') en el ArrayList  
    // nombreArrayList.indexOf("Elemento");
// Devuelve la posición de la última ocurrencia ('Elemento') en el ArrayList   
    // nombreArrayList.lastIndexOf("Elemento");
// Borra el elemento de la posición '5' del ArrayList   
    // nombreArrayList.remove(5); 
// Borra la primera ocurrencia del 'Elemento' que se le pasa como parametro.  
    // nombreArrayList.remove("Elemento");
//Borra todos los elementos de ArrayList   
    // nombreArrayList.clear();
// Devuelve True si el ArrayList esta vacio. Sino Devuelve False   
    // nombreArrayList.isEmpty();  
// Copiar un ArrayList 
    // ArrayList arrayListCopia = (ArrayList) nombreArrayList.clone();  
// Pasa el ArrayList a un Array 
    // Object[] array = nombreArrayList.toArray();   
    
    public String getAlumnoMasAvanzado(){
        String alumnoMasAvanzado = "";
        int materiasAprobadasMayor = 0;
        
        for(int i=0; i < numAlumnos; i++){

            if (alumnos[i].getTotalCalifAprob() > materiasAprobadasMayor){
                materiasAprobadasMayor = alumnos[i].getTotalCalifAprob();
                alumnoMasAvanzado = alumnos[i].getNombreAlum();            
             }
        } 
        return alumnoMasAvanzado;
     } 
    
    
}
