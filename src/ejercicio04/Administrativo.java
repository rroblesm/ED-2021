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
public class Administrativo extends Empleado {
    String departamento;
    String telefono;
    
    public Administrativo(){
        super();
    }
    public Administrativo(String nombreEmpleado, double sueldoBase, String departamento, String telefono){
        super(nombreEmpleado, sueldoBase);
        this.departamento = departamento;
        this.telefono = telefono;
    }

    public String toString() {
        return "Administrativo:" + this.getNombre() + "Del departamento: " + departamento + ", Telefono=" + telefono;
    }
    
    public void setDepartamento(String departamento){
        this.departamento= departamento;
    }
    
    
    
}
