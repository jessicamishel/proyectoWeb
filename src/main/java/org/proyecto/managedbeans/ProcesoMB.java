/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.proyecto.managedbeans;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.proyecto.model.Persona;
import org.proyecto.model.Proceso;
import org.proyecto.services.interfaces.AppServices;

/**
 *
 * @author jmish
 */
@Named
@ViewScoped
public class ProcesoMB implements Serializable{
    @Inject
    private AppServices appServices;
    private List<Proceso> procesos;
@PostConstruct
    public void init() {
        procesos= appServices.methodListGET("http://127.0.0.1:8082/consultarProceso", Proceso[].class);
    }

    public AppServices getAppServices() {
        return appServices;
    }

    public void setAppServices(AppServices appServices) {
        this.appServices = appServices;
    }

    public List<Proceso> getProcesos() {
        return procesos;
    }

    public void setProcesos(List<Proceso> procesos) {
        this.procesos = procesos;
    }

    
}
