/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.empresas.modelo.entidades;

/**
 *
 * @author david
 */
public class Empresa {
    private String id;
    private String nombre_empresa;
    private String fecha_entrada_holding;
    private Integer facturacion_anual;
    private Integer numero_vendedores;
    private Integer num_sedes;

    public Empresa(String id, String nombre_empresa, String fecha_entrada_holding, Integer facturacion_anual, Integer numero_vendedores) {
        this.id = id;
        this.nombre_empresa = nombre_empresa;
        this.fecha_entrada_holding = fecha_entrada_holding;
        this.facturacion_anual = facturacion_anual;
        this.numero_vendedores = numero_vendedores;
    }

    @Override
    public String toString() {
        return "Empresa{" + "id=" + id + ", nombre_empresa=" + nombre_empresa + ", fecha_entrada_holding=" + fecha_entrada_holding + ", facturacion_anual=" + facturacion_anual + ", numero_vendedores=" + numero_vendedores + ", num_sedes=" + num_sedes + '}';
    }

    public Integer getNum_sedes() {
        return num_sedes;
    }

    public void setNum_sedes(Integer num_sedes) {
        if (num_sedes==1){
            this.num_sedes = num_sedes;
        }else{
            System.out.println("la empresa solo puede tener una sede");
        }
    }

    
    
    
}
