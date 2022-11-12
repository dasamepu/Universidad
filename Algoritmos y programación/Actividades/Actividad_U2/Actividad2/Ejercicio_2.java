
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
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int edad, peso;
        
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Cuantos años tiene?");
        edad = keyboard.nextInt();
        System.out.println("Cuanto pesa?");
        peso = keyboard.nextInt();
        System.out.println("Es colombiano? (si/no)");
        Boolean colombiano = new Scanner(System.in).nextLine().equalsIgnoreCase("si")?true:false;
        
        if(edad > 15 && colombiano == true && peso > 60 && peso < 90)
        {
            System.out.println("Sì puede practicar el deporte");
        }
        else
        {
            System.out.println("No puede practicar el deporte");
        }
        
        
    }
}
    
    

