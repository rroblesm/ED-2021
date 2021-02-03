/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import ejercicio10.DeVolteo;

/**
 *
 * @author R
 */
public class EmpTransp {

    
    //AGREGAR METODOS PARA DAR DE ALTA
    
    /*
    A su vez, se tiene información de una empresa de transporte, llamada “El rápido” que tiene tanto camiones escolares
    como de turismo. Define la clase “EmpTransp” que tiene como atributos el nombre de la empresa, el total de camiones
    y los datos de todos sus camiones. Los datos de éstos se encuentran almacenados en un archivo de objetos.
    Si quieres puedes agregar otros atributos y debes definir los métodos necesarios para que la clase tenga el siguiente comportamiento:
     */
    private String nombreEmpresa;
    private int totalCam;
    private Camion[] camiones;
    static int MAX = 1000;

    public EmpTransp() {
        camiones = new Camion[MAX];
    }

    public EmpTransp(String nombreEmpresa, int totalCam) {
        this();
        this.nombreEmpresa = nombreEmpresa;
        this.totalCam = totalCam;
    }

    //1) Llega un cliente para rentar el servicio de un camión para turistas. 
    // Dada la cantidad de pasajeros que se quiere transportar y la cantidad de kilómetros que se van a recorrer, 
    // regresar en forma de cadena las características de todos los camiones disponibles y el costo del servicio de cada uno de ellos.
    public String reporteCamiones(int numPasaj, double km) {
        StringBuilder reporte = new StringBuilder();

        for (int i = 0; i < totalCam; i++) {

            if (camiones[i] instanceof Turismo) {
                reporte.append(((Turismo) camiones[i]).toString());
                reporte.append("\n");

            }
        }
        return reporte.toString();
    }

    //2) Llega el director de una escuela para rentar el servicio de varios camiones escolares.
    // Dada la cantidad máxima de niños que se desea transportar por camión 
    // y la cantidad de camiones requeridos, indicar si es posible satisfacer la demanda.
    public boolean validarDemandaEscolar(int cantMaximaDePasaj, int numCamionesOcupados) {
        boolean res = false;
        int numCamEscolares = 0;

        ///////Meter try catch en caso de que este el arreglo camiones este basio
        for (int i = 0; i < totalCam; i++) {
            if (camiones[i] instanceof Escolar) {
                if (((Escolar) camiones[i]).getTotalPasaj() >= cantMaximaDePasaj) {
                    numCamEscolares++;
                }
            }

            if (numCamionesOcupados <= numCamEscolares) {
                res = true;
            }

        }

        return res;

    }

//3) Dado el número de placas de un camión, indicar si está disponible. Si lo está, regresar qué tipo de unidad es.
        public String buscarCamion(String placas) {
        String tipoDeCamion = "No se encontro";
        boolean existe = false;
        int i = 0;
        while (i < totalCam && !camiones[i].getPlacas().equalsIgnoreCase(placas)) {
            i++;
        }
        
        if(i < totalCam){
            tipoDeCamion = camiones[i].getClass().getSimpleName();
        }
        
        
    
        return tipoDeCamion;

    }

//4) Obtener y regresar en forma de cadena los números de placas de todos los camiones escolares que estén disponibles,

        
        
        
        
//5) Obtener y regresar el total de camiones de una cierta marca (la marca se recibe como parámetro), 
//destinados al transporte de turistas que cuenten con servicio de bar y 
//que el costo del servicio sea inferior a una cantidad recibida como parámetro. También se recibe como parámetro la cantidad de kilómetros a recorrer.

}
