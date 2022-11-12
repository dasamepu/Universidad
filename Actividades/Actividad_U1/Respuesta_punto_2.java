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
