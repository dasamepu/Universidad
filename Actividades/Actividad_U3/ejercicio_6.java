
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
public class ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner keyboard = new Scanner(System.in); 
        System.out.println("Digite un numero entero");
        n = keyboard.nextInt();
     for (int i = 0; i < n; i++) {
        System.out.println("*");
     }
    }
    
}
