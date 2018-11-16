/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5_carlosnuila;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Carlos Nuila
 */
public class Empleado {
    
    String nombreEmpleado;
    Date fechaNacimiento;
    String correo;
    String cargo;
    double salario;
    ArrayList<Empleado> empleadoContratado = new ArrayList();

    public Empleado() {
    }

    public Empleado(String nombreEmpleado, Date fechaNacimiento, String correo, String cargo, double salario) {
        this.nombreEmpleado = nombreEmpleado;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ArrayList<Empleado> getEmpleadoContratado() {
        return empleadoContratado;
    }

    public void setEmpleadoContratado(ArrayList<Empleado> empleadoContratado) {
        this.empleadoContratado = empleadoContratado;
    }
    
    

    @Override
    public String toString() {
        return nombreEmpleado;
    }
    
    
    
}
