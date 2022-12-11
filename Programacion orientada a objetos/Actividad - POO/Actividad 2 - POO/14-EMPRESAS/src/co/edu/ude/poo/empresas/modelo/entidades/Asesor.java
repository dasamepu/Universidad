/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.empresas.modelo.entidades;

/**
 *
 * @author david
 */
public class Asesor {
    private String id;
    private String fecha_inicio;
    private String nombre;
    private String direccion;
    private String titulacion;

    public Asesor(String id, String fecha_inicio, String nombre, String direccion, String titulacion) {
        this.id = id;
        this.fecha_inicio = fecha_inicio;
        this.nombre = nombre;
        this.direccion = direccion;
        this.titulacion = titulacion;
    }

    @Override
    public String toString() {
        return "Asesor{" + "id=" + id + ", fecha_inicio=" + fecha_inicio + ", nombre=" + nombre + ", direccion=" + direccion + ", titulacion=" + titulacion + '}';
    }
    
    
}
