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
import org.proyecto.config.Constantes;
import org.proyecto.model.Area;
import org.proyecto.services.interfaces.AppServices;

/**
 *
 * @author jmish
 */
@ViewScoped
@Named
public class AreaMB implements Serializable{
    @Inject
    private AppServices appServices;
    private List<Area> areas;
    
    @PostConstruct
    public void init(){
        areas= appServices.methodListGET(Constantes.appUrl + "consultarArea", Area[].class);
    }

    public AppServices getAppServices() {
        return appServices;
    }

    public void setAppServices(AppServices appServices) {
        this.appServices = appServices;
    }

    public List<Area> getAreas() {
        return areas;
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }
    
}
