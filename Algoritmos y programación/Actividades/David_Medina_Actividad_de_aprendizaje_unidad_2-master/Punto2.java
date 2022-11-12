public class Punto2 {

    public static void main(String[] args) {
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
