/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04;

import java.util.ArrayList;

/**
 *
 * @author R
 */
public class Empresa {  
    
    private String nombreEmpresa;
    private String nombreDueno;
    private String direccion;
    private Administrativo[] datosAdministrativos;
    private Operario[] datosOperarios;
    private static int numeroDeOperarios;
    private static int numeroDeAdmins;
    private static int MAX_ADMINS = 10;
    private static int MAX_OPERARIOS = 10;
    //ojo, no es Final
    
    public Empresa(){
        numeroDeOperarios = 0;
        numeroDeAdmins = 0;
        datosAdministrativos = new Administrativo[MAX_ADMINS];
        datosOperarios = new Operario[MAX_ADMINS];
    }
    
    public Empresa(String nombreEmpresa, String nombreDueno, String direccion){
        this();
        this.nombreDueno = nombreDueno;
        this.direccion = direccion;
        this.nombreEmpresa = nombreEmpresa;
    }

    //dar de alta tanto operarios como administrativos
    public boolean alta(String nombreEmpleado, double sueldoBase, String departamento, String telefono){
        boolean res = false;
        
        if(numeroDeAdmins >= MAX_ADMINS){
            Administrativo[] nuevosDatosAdmin = new Administrativo[MAX_ADMINS+10];
            for (int i=0; i<= numeroDeAdmins; i++){
                nuevosDatosAdmin[i] = datosAdministrativos[i];
            }
            
            datosAdministrativos = nuevosDatosAdmin;
            MAX_ADMINS += 10;
        }                

        Administrativo nuevoAdmin = new Administrativo(nombreEmpleado, sueldoBase, departamento, telefono);
        datosAdministrativos[numeroDeAdmins] = nuevoAdmin;
        numeroDeAdmins++;
        res = true;
        return res;

    }

    public boolean alta(String nombreEmpleado, double sueldoBase, int horasExtra){
        boolean res = false;
        
        if(numeroDeOperarios >= MAX_OPERARIOS){
            Operario[] nuevosDatosOp = new Operario[MAX_ADMINS+10];
            for (int i=0; i<= numeroDeAdmins; i++){
                nuevosDatosOp[i] = datosOperarios[i];
            }
            
            datosOperarios = nuevosDatosOp;
            MAX_OPERARIOS += 10;
        }                

        Operario nuevoOperario = new Operario(nombreEmpleado, sueldoBase, horasExtra);
        datosOperarios[numeroDeOperarios] = nuevoOperario;
        numeroDeOperarios++;
        res = true;
        return res;

        
    }    
    //generar un reporte con los nombres y los sueldos base
    public String[] reporte(){
        String[] todosLosEmpleados = new String[numeroDeOperarios+1+numeroDeAdmins+1];
        
        for (int i=0; i < datosOperarios.length ; i++){
            todosLosEmpleados[i] = datosOperarios[i].getNombre() +":" +  datosOperarios[i].getSueldoBase();
        }
        for (int i=0; i < datosAdministrativos.length ;i++){
            todosLosEmpleados[i] = datosAdministrativos[i].getNombre() +":" +  datosAdministrativos[i].getSueldoBase();
        }
        
        return todosLosEmpleados;
    }

    //Dada la clave de un empleado administrativo y un porcentaje de aumento, si está registrado, actualizar su sueldo.
    public boolean aumento(int claveEmpleado, int aumento){
        boolean existe = false;
        int posicion = -1;
        //¿Porque -1? Es una capa adicional de seguridad
        //si por alguna razon existe se vuelve true, cuando quiera obtener la posicion, me dara error al querer mostrar el array
        
        int i = 0;
        while( i< datosAdministrativos.length && datosAdministrativos[i].getClave()!=claveEmpleado ){
            
            if( datosAdministrativos[i].getClave() == claveEmpleado){
                existe = true;
                posicion = i;
            }
            i++;
            
        }
        
        if(existe == true){
            double nuevoSueldo = datosAdministrativos[posicion].getSueldoBase() + (datosAdministrativos[posicion].getSueldoBase() * aumento/100) ;
            datosAdministrativos[posicion].setSueldoBase(nuevoSueldo);  
        }
        return existe;
        //si no se encontro esa persona, te regresa false;
    }
    
    //Dada la clave de un empleado administrativo y un nombre de departamento, si está, registrar el cambio de departamento.    
    public boolean cambioDepartamento(int claveEmpleado, String departamento){
        boolean existe = false;
        int posicion = -1;
        //¿Porque -1? Es una capa adicional de seguridad
        //si por alguna razon existe se vuelve true, cuando quiera obtener la posicion, me dara error al querer mostrar el array
        int i = 0;
        while( i< datosAdministrativos.length || datosAdministrativos[i].getClave()!=claveEmpleado ){
            
            if( datosAdministrativos[i].getClave() == claveEmpleado){
                existe = true;
                posicion = i;
            }
            i++;
            
        }
        
        if(existe == true){
            datosAdministrativos[posicion].setDepartamento(departamento);
        }
        
        return existe;
        //si no se encontro esa persona, te regresa false;
    }


    //Dada la clave de un operario y los datos necesarios, si está, imprimir cuanto cobrará ese operario este mes.
    public boolean calculoCobroOperario(int claveEmpleado, double prestaciones, double deducciones, int horasExtra){
        boolean existe = false;
        int posicion = -1;
        //¿Porque -1? Es una capa adicional de seguridad
        //si por alguna razon existe se vuelve true, cuando quiera obtener la posicion, me dara error al querer mostrar el array
        int i = 0;
        while( i< datosAdministrativos.length || datosAdministrativos[i].getClave()!=claveEmpleado ){
            
            if( datosAdministrativos[i].getClave() == claveEmpleado){
                existe = true;
                posicion = i;
            }
            i++;
            
        }

        if(existe == true){
            datosOperarios[posicion].calculaSalario(prestaciones, deducciones, horasExtra);
        }
        
        return existe;
        //si no se encontro esa persona, te regresa false;
    }
    
    
    // Generar un reporte con los nombres de todos los operarios que tienen un sueldo base menor 
    // --> a cierta cantidad dada como parámetro. Además, debe incluir el total de empleados operariosque cumplen con esa condición.
 
    public void reporte(double sueldoAComparar){
        int numeroDeEmpleadosMenorAlPromedio = 0;
        for(int i=0; i< datosOperarios.length ; i++){
            if( datosAdministrativos[i].getSueldoBase() < sueldoAComparar){
                System.out.println("Empleado: " + datosAdministrativos[i].getNombre());
                numeroDeEmpleadosMenorAlPromedio++;
            }
        }
        
        System.out.println("Hay "+ numeroDeEmpleadosMenorAlPromedio + " con sueldo base menor a " + sueldoAComparar);

    }
    
    
    
}
