/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.empresas.modelo.entidades;

/**
 *
 * @author david
 */
public class Area {
    private String id;
    private String nombre;
    private String descripción;

    public Area(String id, String nombre, String descripción) {
        this.id = id;
        this.nombre = nombre;
        this.descripción = descripción;
    }

    @Override
    public String toString() {
        return "Area{" + "id=" + id + ", nombre=" + nombre + ", descripci\u00f3n=" + descripción + '}';
    }
    
    
}
