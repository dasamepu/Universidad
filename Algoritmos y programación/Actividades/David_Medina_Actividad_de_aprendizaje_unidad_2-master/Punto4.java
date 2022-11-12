public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double v1, v2, v3, v4, v5, promedio, mayor = 0, menor = 0;
        int Contador_Ventas = 0;
        System.out.println("Digite venta 1");
        v1 = teclado.nextDouble();
        System.out.println("Digite venta 2");
        v2 = teclado.nextDouble();
        System.out.println("Digite venta 3");
        v3 = teclado.nextDouble();
        System.out.println("Digite venta 4");
        v4 = teclado.nextDouble();
        System.out.println("Digite venta 5");
        v5 = teclado.nextDouble();

        //Para conocer Numero de ventas mayores a $100000
        if (v1 > 1000000) {
            Contador_Ventas++;
        }
        if (v2 > 1000000) {
            Contador_Ventas++;
        }
        if (v3 > 1000000) {
            Contador_Ventas++;
        }
        if (v4 > 1000000) {
            Contador_Ventas++;
        }
        if (v5 > 1000000) {
            Contador_Ventas++;
        }

        // para conocer el promedioo de ventas
        promedio = (v1 + v2 + v3 + v4 + v5) / 5;

        // para conocer el mayor de las ventas
        if (v1 > v2 && v1 > v3 && v1 > v4 && v1 > v5) {
            mayor = v1;
        }
        if (v2 > v1 && v2 > v3 && v2 > v4 && v2 > v5) {
            mayor = v2;
        }
        if (v3 > v1 && v3 > v2 && v3 > v4 && v3 > v5) {
            mayor = v3;
        }
        if (v4 > v1 && v4 > v2 && v4 > v3 && v4 > v5) {
            mayor = v4;
        }
        if (v5 > v1 && v5 > v2 && v5 > v3 && v5 > v4) {
            mayor = v5;
        }

        // para conocer el menor de las ventas
        if (v1 < v2 && v1 < v3 && v1 < v4 && v1 < v5) {
            menor = v1;
        }
        if (v2 < v1 && v2 < v3 && v2 < v4 && v2 < v5) {
            menor = v2;
        }
        if (v3 < v1 && v3 < v2 && v3 < v4 && v3 < v5) {
            menor = v3;
        }
        if (v4 < v1 && v4 < v2 && v4 < v3 && v4 < v5) {
            menor = v4;
        }
        if (v5 < v1 && v5 < v2 && v5 < v3 && v5 < v4) {
            menor = v5;
        }
        //Resultado
        System.out.println("el promedio de las ventas es igual a " + promedio
                + "\n Numero de ventas > a 1000000 son " + Contador_Ventas
                + "\n La mayor de las ventas es " + mayor
                + "\n La menor de las ventas es " + menor);
        
        
        
    }
    
}
