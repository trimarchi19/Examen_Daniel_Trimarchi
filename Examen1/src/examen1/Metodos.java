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
public class Metodos {
    private ArrayList<Atributos> atris=new ArrayList();
    private String Atributo1;
    private String M_nombre;

    public Metodos() {
    }

    public Metodos(String M_nombre) {
        this.M_nombre = M_nombre;
    }

    public String getM_nombre() {
        return M_nombre;
    }

    public void setM_nombre(String M_nombre) {
        this.M_nombre = M_nombre;
    }

   

    public Metodos(String Atributo1, String M_nombre) {
        this.Atributo1 = Atributo1;
        this.M_nombre = M_nombre;
    }
    

    public String getAtributo1() {
        return Atributo1;
    }

    public void setAtributo1(String Atributo1) {
        this.Atributo1 = Atributo1;
    }

    @Override
    public String toString() {
        return M_nombre+",";
    }

    public ArrayList<Atributos> getAtris() {
        return atris;
    }

    public void setAtris(ArrayList<Atributos> atris) {
        this.atris = atris;
    }
    
    
}
