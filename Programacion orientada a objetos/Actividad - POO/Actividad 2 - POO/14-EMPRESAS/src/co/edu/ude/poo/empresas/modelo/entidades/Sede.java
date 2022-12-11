/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.empresas.modelo.entidades;

/**
 *
 * @author david
 */
public class Sede {
    private String id;
    private String ciudad_localiza;

    public Sede(String id, String ciudad_localiza) {
        this.id = id;
        this.ciudad_localiza = ciudad_localiza;
    }

    @Override
    public String toString() {
        return "Sede{" + "id=" + id + ", ciudad_localiza=" + ciudad_localiza + '}';
    }
}
