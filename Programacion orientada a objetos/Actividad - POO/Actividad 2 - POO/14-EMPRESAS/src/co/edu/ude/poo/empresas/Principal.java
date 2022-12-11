/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.ude.poo.empresas;
import co.edu.ude.poo.empresas.modelo.entidades.*;
/**
 *
 * @author david
 */
public class Principal {
    public static void main(String[] args){
        Empresa empresa1 = new Empresa("12345", "ecopetrol", 
                "1/1/2022", 1000000, 1000);
        System.out.println(empresa1);
        empresa1.setNum_sedes(5);

        System.out.println("");
        
        Empresa empresa2 = new Empresa("54321", "terpel", 
                "2/1/2022", 1000000, 1000);
        System.out.println(empresa2);
        empresa1.setNum_sedes(1);
    
        System.out.println("");
        
        Area area1 = new Area("123", "Financiera", 
                "En esta area, los vendedores de la empresa ofreceran "
                        + "productos financieros a sus clientes");
    }
    
}
