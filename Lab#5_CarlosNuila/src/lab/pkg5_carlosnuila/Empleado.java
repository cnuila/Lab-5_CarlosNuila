/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5_carlosnuila;

import java.util.Date;

/**
 *
 * @author Carlos Nuila
 */
public class Empleado {
    
    String nombreEmpleado;
    Date fechaNacimiento;
    String cargo;
    double salario;

    public Empleado() {
    }

    public Empleado(String nombreEmpleado, Date fechaNacimiento, String cargo, double salario) {
        this.nombreEmpleado = nombreEmpleado;
        this.fechaNacimiento = fechaNacimiento;
        this.cargo = cargo;
        this.salario = salario;
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
    
    
    
}