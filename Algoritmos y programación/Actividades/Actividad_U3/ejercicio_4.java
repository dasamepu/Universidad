
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
public class ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pot = 0;
     int base = 0;
     int expo = 0;
        Scanner keyboard = new Scanner(System.in); 
        System.out.print("Digite la base de la potencia: ");
        base = keyboard.nextInt();
        System.out.print("Digite el exponente de la potencia: ");
        expo = keyboard.nextInt();

     pot = base;

     for (int i = 1; i < expo; i++) {
        pot = pot * base;
     }
     System.out.println(pot);
    }
    
}
