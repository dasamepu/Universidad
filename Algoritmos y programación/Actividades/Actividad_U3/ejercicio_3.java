
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int n,i,rs=0;
        double pr = 0; 
        for(i=1;i<=10;){
            System.out.println("Digite la nota "+i+" :");
            n = entrada.nextInt();i++;rs=rs+n;}
        pr=rs/10;
        System.out.println("el promedio es: "+pr);
    }
    
}
