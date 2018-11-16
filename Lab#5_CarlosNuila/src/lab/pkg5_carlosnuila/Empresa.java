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
public class Empresa {
    
    String nombreEmpresa;
    double capital;
    Date fechaFundación;
    String ubicacion;
    int idSucursal;
    String pinAcceso;

    public Empresa() {
    }

    public Empresa(String nombreEmpresa, double capital, Date fechaFundación, String ubicacion, int idSucursal, String pinAcceso) {
        this.nombreEmpresa = nombreEmpresa;
        this.capital = capital;
        this.fechaFundación = fechaFundación;
        this.ubicacion = ubicacion;
        this.idSucursal = idSucursal;
        this.pinAcceso = pinAcceso;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public Date getFechaFundación() {
        return fechaFundación;
    }

    public void setFechaFundación(Date fechaFundación) {
        this.fechaFundación = fechaFundación;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getPinAcceso() {
        return pinAcceso;
    }

    public void setPinAcceso(String pinAcceso) {
        this.pinAcceso = pinAcceso;
    }

    @Override
    public String toString() {
        return nombreEmpresa;
    }
    
    
    
    
}
