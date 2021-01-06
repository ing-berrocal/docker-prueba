/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dockerprueba;

import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author DELL
 */
@ApplicationScoped
public class GreetingService {
    
    public String servicioNombre(String nombre){
        return "Hello+-"+nombre;
    }
}
