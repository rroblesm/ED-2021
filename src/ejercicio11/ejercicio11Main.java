/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.io.IOException;

/**
 *
 * @author R
 */
public class ejercicio11Main {

    public static void main(String[] args) throws IOException {
        EmpTransp rap = new EmpTransp("El rápido");

        rap.altaCamion("Heng", "784512", "PRY-328", 109250.99, 20, true);//Escolar
        rap.altaCamion("MTs", "982225", "HYI-388", 150000, 21, true);//Escolar
        rap.altaCamion("Tams", "397159", "RRI-002", 69333, 23, true, true); //turistico
        rap.altaCamion("NRS", "874596", "R2U- 110", 99999.99, 27, true, true); //turistico

        //Inciso 1)
        System.out.println(rap.reporteCamiones(12, 15));
        //Inciso 2)

        if (rap.validarDemandaEscolar(20, 1)) {
            System.out.println("\nLos camiones son suficientes para cumplir la demanda del director");
        } else {
            System.out.println("No tenemos suficientes camiones");
        }

        //Inciso 3)
        System.out.println("\nEl camion con placas YUI-798 está? " + rap.buscarCamion("YUI-798"));
        System.out.println("\nEl camion con placas R2U- 110 está? " + rap.buscarCamion("R2U- 110"));

//        //Inciso 4)
        System.out.println("Registro de todos los camiones escolares que pueden llevar a más de 20 niños y tiene espacio para sus proyectos:" + rap.camionesDisp20AlumnosYLugarProy());

//        //Inciso 5)
        System.out.println("\nTotal de camiones con servicio de bar que se adapten al numero de pasajeros y al presupuesto del contratista y la marca que desee: " + rap.totCamionesConBarYMenosDelPresupuesot("NRS", 200, 30));

    }
}
