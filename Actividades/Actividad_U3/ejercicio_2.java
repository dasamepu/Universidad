
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
public class ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
     int count = 0;
     int n = 0;
        Scanner keyboard = new Scanner(System.in); 
        System.out.println("Digite un numero entero");
        n = keyboard.nextInt();
        System.out.println("los numeros desde 1 hasta " + n + " son ");

     for (count = 1; count <= n; count++) {
        sum = sum + count;
        System.out.println(count);
     }
     
     System.out.println("la suma de todos los numeros es " + sum);
    }
    
}
