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

    public Empleado() {
    }

    public Empleado(String nombreEmpleado, String correo, String cargo) {
        this.nombreEmpleado = nombreEmpleado;
        this.correo = correo;
        this.cargo = cargo;
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
    
    @Override
    public String toString() {
        return nombreEmpleado;
    }

    public String toString2() {
        return "Nombre del Empleado=" + nombreEmpleado + "\nFecha de Nacimiento=" + fechaNacimiento + "\nCorreo=" + correo + "\nCargo=" + cargo + "\nSalario=" + salario;
    }
    
    
    
    
    
}
