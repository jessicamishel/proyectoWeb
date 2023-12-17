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
import org.proyecto.model.Proyecto;
import org.proyecto.services.interfaces.AppServices;

/**
 *
 * @author jmish
 */
@Named
@ViewScoped
public class ProyectoMB implements Serializable{
    @Inject
    private AppServices appServices;
    private List<Proyecto> proyectos;
@PostConstruct
    public void init() {
        proyectos= appServices.methodListGET("http://127.0.0.1:8082/consultarProyecto", Proyecto[].class);
    }

}
