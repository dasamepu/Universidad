public class Punto3 {

    public static void main(String[] args) {
        int n, n1, n2, n3;
        Scanner keyboard = new Scanner(System.in); 
        System.out.println("Digite un numero de tres digitos");
        n = keyboard.nextInt();
        if(n >= 100 && n <= 999)
        {
            n3 = n % 10;
            n2 = n / 10 % 10;
            n1 = n /100 % 10;
            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n3);
            
            if(n1 > n2 && n1 < n3 || n1 < n2 && n1 > n3)
            {
                System.out.println("Numero del medio es " + n1);
            }
            else if(n2 > n1 && n2 < n3 || n2 < n1 && n2 > n3)
            {
                System.out.println("Numero del medio es " + n2);
            }
            else if(n3 > n2 && n3 < n1 || n3 < n2 && n3 > n1)
            {
                System.out.println("Numero del medio es " + n3);
            }
            else
            {
                System.out.println("error, el numero que introdujo puede que tenga digitos repetidos por lo que no se puede resalar el numero mediano");
            }
            
        }
        else
        {
            System.out.println("El numero no es valido");
        }
    }
}
