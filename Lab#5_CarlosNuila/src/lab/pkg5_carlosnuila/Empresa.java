/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5_carlosnuila;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

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
    DefaultTreeModel modelo_empresa;
    
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
    
    public Empresa(String nombreEmpresa, double capital, Date fechaFundación, String ubicacion, int idSucursal, String pinAcceso, DefaultTreeModel modelo_empresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.capital = capital;
        this.fechaFundación = fechaFundación;
        this.ubicacion = ubicacion;
        this.idSucursal = idSucursal;
        this.pinAcceso = pinAcceso;
        this.modelo_empresa = modelo_empresa;
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

    public DefaultTreeModel getModelo_Empresa() {
        return modelo_empresa;
    }

    public void setModelo_empresa(DefaultTreeModel modelo_empresa) {
        this.modelo_empresa = modelo_empresa;
    }
    
    @Override
    public String toString() {
        return nombreEmpresa;
    }
    
    
    
    
}
