/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act_final;

import java.util.Scanner;

/**
 *
 * @author JD
 */
public class Act_final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Punto 1 Perimetro del hexagono
        //Delay
         try{
            Thread.sleep(5000);
            System.out.println("Incio del Punto 1");
           }
        catch(InterruptedException e){
            System.err.println(e.getMessage());
            }
        //Introduciendo datos para calcular el perimetro del hexagono
       double perimetro, lado;
       Scanner teclado = new Scanner(System.in);
       System.out.println("Introdusca la medida de uno de sus lados");
       lado = teclado.nextDouble();
       perimetro = lado*6;
        System.out.println("El perimetro del hexagono es " + perimetro + " centimetros");
        //Punto 2 Calculo De la nomina semanal de los obreros
        //Delay
         try{
            Thread.sleep(5000);
            System.out.println("Incio del Punto 2");
           }
        catch(InterruptedException e){
            System.err.println(e.getMessage());
            }
        //
        final double valor_hora = 1000;
        double horas_trabajadas_1, horas_trabajadas_2, horas_trabajadas_3, horas_trabajadas_4, horas_trabajadas_5, 
            pago_semanal_1, pago_semanal_2, pago_semanal_3, pago_semanal_4, pago_semanal_5, total_pagado;
        Scanner keyboard = new Scanner(System.in);
            System.out.println("¿Cuantas horas trabajo el obrero 1 en la semana?");
            horas_trabajadas_1 = keyboard.nextDouble();
            pago_semanal_1 = horas_trabajadas_1*valor_hora;
            System.out.println("El obrero 1 gano en la semana " + pago_semanal_1 + " pesos");
        
            System.out.println("¿Cuantas horas trabajo el obrero 2 en la semana?");
            horas_trabajadas_2 = keyboard.nextDouble();
            pago_semanal_2 = horas_trabajadas_2*valor_hora;
            System.out.println("El obrero 2 gano en la semana " + pago_semanal_2 + " pesos");
            
            System.out.println("¿Cuantas horas trabajo el obrero 3 en la semana?");
            horas_trabajadas_3 = keyboard.nextDouble();
            pago_semanal_3 = horas_trabajadas_3*valor_hora;
            System.out.println("El obrero 3 gano en la semana " + pago_semanal_3 + " pesos");
            
            System.out.println("¿Cuantas horas trabajo el obrero 4 en la semana?");
            horas_trabajadas_4 = keyboard.nextDouble();
            pago_semanal_4 = horas_trabajadas_4*valor_hora;
            System.out.println("El obrero 4 gano en la semana " + pago_semanal_4 + " pesos");
            
            System.out.println("¿Cuantas horas trabajo el obrero 5 en la semana?");
            horas_trabajadas_5 = keyboard.nextDouble();
            pago_semanal_5 = horas_trabajadas_5*valor_hora;
            System.out.println("El obrero 5 gano en la semana " + pago_semanal_5 + " pesos");
            
            total_pagado = pago_semanal_1+pago_semanal_2+pago_semanal_3+pago_semanal_4+pago_semanal_5;
            System.out.println("El valor total pagado a los obreros es " + total_pagado + " pesos");
        //Punto 4 conversion de decadadas a dias
        //Delay
        try{
            Thread.sleep(5000);
            System.out.println("Incio del Punto 4");
            }
        catch(InterruptedException e){
            System.err.println(e.getMessage());
            } 
        //
        Scanner decadas = new Scanner(System.in);
        double Decadas, Días;
        System.out.println("Introduce las decadas");
        Decadas = decadas.nextDouble();
        Días = (Decadas * 3650) / 1;
        System.out.println( Decadas + " Decadas es igual a " + Días + " Días");
        //Punto 5 calcular la masa
        //Delay
         try{
            Thread.sleep(5000);
            System.out.println("Incio del Punto 5");
            }
        catch(InterruptedException e){
            System.err.println(e.getMessage());
            }    
        //
        double m,t,p,v; // masa=m,t=temperatura,p=presion,v=volumen
        Scanner masa = new Scanner (System.in);
        System.out.println("digite temperatura:");
        t = masa.nextDouble();
        System.out.println("digite volumen:");
        v = masa.nextDouble();
        System.out.println("digite presion:");
        p = masa.nextDouble();
        m = (p * v)/(0.37 * (t + 460));
        System.out.println("la masa es igual a =" +m);
        //Punto 6 calcular el numero de pulsaciones de una persona
        //delay
        try{
            Thread.sleep(5000);
            System.out.println("Incio del Punto 6");
           }
        catch(InterruptedException e){
            System.err.println(e.getMessage());
           }
        //
        Scanner in = new Scanner(System.in);
        double edad, numero_de_pulsaciones;
        System.out.print("Ingresa el valor de edad: ");
        edad = in.nextDouble();
        in.nextLine();
        numero_de_pulsaciones=(220.0-edad)/10;
        System.out.println("Valor de numero de pulsaciones: " + numero_de_pulsaciones);
        //Punto 7 convertir de farenheit a celcius 
        //delay
        try{
            Thread.sleep(5000);
            System.out.println("Incio del Punto 7");
           }
        catch(InterruptedException e){
            System.err.println(e.getMessage());
           }
        //
        double C,F;// Celcius = C y farenheit = F
        System.out.println("Digite los grados farenheit");
        Scanner grados2 = new Scanner (System.in);
        F = grados2.nextDouble();
        C = (float)5/9*(F-32);
        System.out.println(F+ "grados farenheit es igual a="+ C +"grados celcius ");
        //Punto 8 convertir de celcius a farenheit
        //delay
        try{
            Thread.sleep(5000);
            System.out.println("Incio del Punto 8");
           }
        catch(InterruptedException e){
            System.err.println(e.getMessage());
           }
        //
         Scanner grados1 = new Scanner(System.in);
        double gradosC, gradosF;
        System.out.println("Introduce los grados Celcius");
        gradosC = grados1.nextDouble();
        gradosF = (gradosC * 9/5) + 32;
        System.out.println( gradosC + " grados Celcius es igual a " + gradosF + " grados Farenheit");
    }
    
}
