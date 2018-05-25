/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.ArrayList;

/**
 *
 * @author X
 */
public class Clases {
    ArrayList<Metodos> metodos=new ArrayList();
    private String nombre;

    public Clases(String nombre) {
        this.nombre = nombre;
    }

    public Clases() {
    }

    public ArrayList<Metodos> getMetodos() {
        return metodos;
    }

    public void setMetodos(ArrayList<Metodos> metodos) {
        this.metodos = metodos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
