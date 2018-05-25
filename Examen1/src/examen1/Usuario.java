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
public class Usuario {

    /**
     * un nombre de usuario, contraseña, fecha de nacimiento, número telefónico,
     * correo electrónico, Nombre completo, genero favorito de lectura, una
     * lista de libros y una lista de amigos.
     */
    private String nombre;
    private String contraseña;
    private String numero;
    private String correo;
    private String usuario;
    private ArrayList<Clases> clases = new ArrayList();

    public Usuario() {
        
    }

    public Usuario(String nombre, String contraseña, String numero, String correo, String usuario) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.numero = numero;
        this.correo = correo;
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public ArrayList<Clases> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clases> clases) {
        this.clases = clases;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", usuario=" + usuario + '}';
    }

    

   
    
}
