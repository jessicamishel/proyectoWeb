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
import org.proyecto.model.Area;
import org.proyecto.model.Proceso;
import org.proyecto.model.Proyecto;
import org.proyecto.services.interfaces.AppServices;

/**
 *
 * @author jmish
 */
@Named
@ViewScoped
public class ProyectoMB implements Serializable {

    @Inject
    private AppServices appServices;
    private List<Proyecto> proyectos;
    private List<Area> areas;
    private List<Proceso> procesos;
    private Proyecto proyecto;

    @PostConstruct
    public void init() {
        proyecto = new Proyecto();
    //    proyectos = appServices.methodListGET("http://127.0.0.1:8082/consultarProyecto", Proyecto[].class);
        areas = appServices.methodListGET("http://127.0.0.1:8082/consultarArea", Area[].class);
        procesos = appServices.methodListGET("http://127.0.0.1:8082/consultarProceso", Proceso[].class);

    }

    public AppServices getAppServices() {
        return appServices;
    }

    public void setAppServices(AppServices appServices) {
        this.appServices = appServices;
    }

    public List<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public List<Area> getAreas() {
        return areas;
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }

    public List<Proceso> getProcesos() {
        return procesos;
    }

    public void setProcesos(List<Proceso> procesos) {
        this.procesos = procesos;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

}
