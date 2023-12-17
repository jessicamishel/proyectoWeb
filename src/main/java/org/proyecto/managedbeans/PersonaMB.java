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
import org.proyecto.services.interfaces.AppServices;

/**
 *
 * @author jmish
 */
@Named
@ViewScoped
public class PersonaMB implements Serializable {

    @Inject
    private AppServices appServices;
    
    private List<Persona> personas;

    @PostConstruct
    public void init() {
        personas = appServices.methodListGET("http://127.0.0.1:8082/consultarResponsable", Persona[].class);
    }

    public AppServices getAppServices() {
        return appServices;
    }

    public void setAppServices(AppServices appServices) {
        this.appServices = appServices;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

}
