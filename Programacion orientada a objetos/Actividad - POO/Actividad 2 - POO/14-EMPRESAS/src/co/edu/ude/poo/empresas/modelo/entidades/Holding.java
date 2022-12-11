/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.empresas.modelo.entidades;

/**
 *
 * @author david
 */
public class Holding {
    private String id;
    private String nombre_holding;

    public Holding(String id, String nombre_holding) {
        this.id = id;
        this.nombre_holding = nombre_holding;
    }

    @Override
    public String toString() {
        return "Holding{" + "id=" + id + ", nombre_holding=" + nombre_holding + '}';
    }
}
