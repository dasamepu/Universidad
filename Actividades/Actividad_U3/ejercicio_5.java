/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Multiplos de 4 y 6 hasta 10000");
     
     for(int i=1;i<=10000;i++){
       if(i%4==0 && i%6==0){
          System.out.println(i);
       }
     }
    }
    
}
