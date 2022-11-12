
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
public class ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, impar;
        double suma;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresar numero : ");
        suma = teclado.nextDouble();
        n = teclado.nextInt();
        for (int i = 0; 1 <= n; i++) {
            if (n % 2 == 0) {
                impar = n + 1;
                System.out.println("la suma es : " + impar);
            }

        }
    }
}
