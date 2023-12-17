/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.proyecto.services.interfaces;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jmish
 */
@Local
public interface AppServices {
    public Object methodGET(String url, Class clazz);
    public List methodListGET(String url, Class clazz);
    public Object methodPOST(Object data, String url, Class clazz);
    public List methodListPOST(Object data,String url, Class clazz);
    
}
