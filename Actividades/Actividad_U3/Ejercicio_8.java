
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
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int i, n;
        n = teclado.nextInt();
        System.out.println("tabla de multiplicar del : " + n);
        for (i = 0; i <= 10; i++) {
            System.out.println(+i + "*" + n + "=" + n * i);
        }

    }

}
