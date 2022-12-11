/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.empresas.modelo.entidades;

/**
 *
 * @author david
 */
public class Pais {
    private String id;
    private String nombre;
    private String capital;
    private Integer num_habitantes;
    private Integer pib;

    public Pais(String id, String nombre, String capital, Integer num_habitantes, Integer pib) {
        this.id = id;
        this.nombre = nombre;
        this.capital = capital;
        this.num_habitantes = num_habitantes;
        this.pib = pib;
    }

    @Override
    public String toString() {
        return "Pais{" + "id=" + id + ", nombre=" + nombre + ", capital=" + capital + ", num_habitantes=" + num_habitantes + ", pib=" + pib + '}';
    }
    
    
}
