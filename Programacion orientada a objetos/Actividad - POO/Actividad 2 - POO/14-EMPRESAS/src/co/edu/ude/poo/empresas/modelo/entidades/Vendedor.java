/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.empresas.modelo.entidades;

/**
 *
 * @author david
 */
public class Vendedor {
    private String id;
    private String nombre;
    private String direccion;
    private Integer numero_trabajos;

    public Vendedor(String id, String nombre, String direccion, Integer numero_trabajos) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numero_trabajos = numero_trabajos;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", numero_trabajos=" + numero_trabajos + '}';
    }

    public Integer getNumero_trabajos() {
        return numero_trabajos;
    }

    public void setNumero_trabajos(Integer numero_trabajos) {
        if (numero_trabajos==1){
            this.numero_trabajos = numero_trabajos;
        }else{
            System.out.println("El vendedor solo puede trabajar para una empresa");
        }
    }
    
    
}
