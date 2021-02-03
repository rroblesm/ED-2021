/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.ArrayList;

/**
 *
 * @author R
 */
public class EmpresaMinera {

    private String nombreEmpresa;
    private int MAX = 1000;
    private Camion[] camiones;
    private int totalCam;

    public EmpresaMinera() {
        totalCam = 0;
        camiones = new Camion[MAX];
    }

    public EmpresaMinera(String nombreEmpresa) {
        this();
        this.nombreEmpresa = nombreEmpresa;
    }

    public void altaCamion(String marca, String numMotor, String placas, int totalPasaj) {
        if (totalCam < camiones.length) {
            camiones[totalCam] = new DePasajeros(marca, numMotor, placas, totalPasaj);
            totalCam++;
        }

    }

    public void altaCamion(String marca, String numMotor, String placas, double capacidadTon) {
        if (totalCam < camiones.length) {
            camiones[totalCam] = new DeVolteo(marca, numMotor, placas, capacidadTon);
            totalCam++;
        }
    }

//    1) Regresar en forma de cadena todos los datos de los camiones de pasajeros.
    public ArrayList<String> datosCamionesPasajeros() {
        ArrayList<String> datosCamPas = new ArrayList<String>();
        for (int i = 0; i < totalCam; i++) {
            if (camiones[i] instanceof DePasajeros) {
                datosCamPas.add(camiones[i].toString());
            }
        }

        return datosCamPas;
    }
    ////no ocupo arrayList, simplemente lo quiero imprimir como reporte

//    2) Dada la placa de un camión de volteo, actualizar su capacidad de transporte (la nueva capacidad se recibe como parámetro).
    public boolean actualizarTonelage(String placas, int capacidadTon) {
        int posicion = -1;
        boolean existe = false;
        int i = 0;
        while (i < totalCam && !camiones[i].getPlacas().equalsIgnoreCase(placas)) {
            i++;
        }
        
        if (i < totalCam && camiones[i] instanceof DeVolteo) {
            existe = true;
            ((DeVolteo) camiones[posicion]).setCapacidadTon(capacidadTon);
        }

        return existe;

    }
//    3) Calcular y regresar el total de camiones de pasajeros que sean de una cierta marca (la marca se recibe como parámetro).

    public int numCamionesDeMarca(String marca) {
        int numDeMarca = 0;
        for (int i = 0; i < totalCam; i++) {
            if (camiones[i] instanceof DePasajeros && camiones[i].getMarca().equalsIgnoreCase(marca)) {
                numDeMarca++;
            }
        }

        return numDeMarca;
    }

//    4) Calcular y regresar el total de toneladas de tierra que puede ser transportado simultáneamente.
    public double tonelageEmpresarial() {
        double tonelage = 0;

        for (int i = 0; i < totalCam; i++) {
            if (camiones[i] instanceof DeVolteo) {
                tonelage += ((DeVolteo) camiones[i]).getCapacidadTon();
            }
        }
        return tonelage;
    }

}
