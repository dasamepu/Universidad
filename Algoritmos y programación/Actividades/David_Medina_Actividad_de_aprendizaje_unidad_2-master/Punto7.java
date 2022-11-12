public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double  numero_de_ventas, sueldo_total=0;
        String nombre_vendedor;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el nombre del primer vendedor:");
        nombre_vendedor=sc.next();
        System.out.println("Ingrese cuanto vendio al mes el primer vendedor:");
        numero_de_ventas=sc.nextDouble();
        sueldo_total=1000000+0.36*numero_de_ventas;
        System.out.println("El vendedor "+nombre_vendedor+" vendio un total de "+numero_de_ventas+" ventas al mes y su sueldo es de: "+sueldo_total);
        
        double  numero_de_ventas2, sueldo_total2=0;
        String nombre_vendedor2;
        Scanner dos= new Scanner(System.in);
        System.out.println("Ingrese el nombre del segundo vendedor:");
        nombre_vendedor2=dos.next();
        System.out.println("Ingrese cuanto vendio al mes el vendedor:");
        numero_de_ventas2=dos.nextDouble();
        sueldo_total2=1000000+0.36*numero_de_ventas2;
        System.out.println("El vendedor "+nombre_vendedor2+" vendio un total de "+numero_de_ventas2+" ventas al mes y su sueldo es de: "+sueldo_total2);
        
        double  numero_de_ventas3, sueldo_total3=0;
        String nombre_vendedor3;
        Scanner tres= new Scanner(System.in);
        System.out.println("Ingrese el nombre del tercer vendedor:");
        nombre_vendedor3=tres.next();
        System.out.println("Ingrese cuanto vendio al mes el tercer vendedor:");
        numero_de_ventas3=tres.nextDouble();
        sueldo_total3=1000000+0.36*numero_de_ventas3;
        System.out.println("El vendedor "+nombre_vendedor3+" vendio un total de "+numero_de_ventas3+" ventas al mes y su sueldo es de: "+sueldo_total3);
        
        double  numero_de_ventas4, sueldo_total4=0;
        String nombre_vendedor4;
        Scanner cuatro= new Scanner(System.in);
        System.out.println("Ingrese el nombre del cuarto vendedor:");
        nombre_vendedor4=cuatro.next();
        System.out.println("Ingrese cuanto vendio al mes el cuarto vendedor:");
        numero_de_ventas4=cuatro.nextDouble();
        sueldo_total4=1000000+0.36*numero_de_ventas4;
        System.out.println("El vendedor "+nombre_vendedor4+" vendio un total de "+numero_de_ventas4+" ventas al mes y su sueldo es de: "+sueldo_total4);
        
        double  numero_de_ventas5, sueldo_total5=0;
        String nombre_vendedor5;
        Scanner cinco= new Scanner(System.in);
        System.out.println("Ingrese el nombre del quinto vendedor:");
        nombre_vendedor5=cinco.next();
        System.out.println("Ingrese cuanto vendio al mes el quinto vendedor:");
        numero_de_ventas5=cinco.nextDouble();
        sueldo_total5=1000000+0.36*numero_de_ventas5;
        System.out.println("El vendedor "+nombre_vendedor5+" vendio un total de "+numero_de_ventas5+" ventas al mes y su sueldo es de: "+sueldo_total5);
    }
}
    
    

