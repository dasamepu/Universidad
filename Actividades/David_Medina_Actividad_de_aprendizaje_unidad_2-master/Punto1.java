public class Punto1 {

    public static void main(String[] args) {
        int n, horas, residuo_de_horas, minutos, segundos;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de minutos que desee");
        n = keyboard.nextInt();
        horas = n/60;
        minutos = n%60;
        segundos = 0;
        /* Segundos siempre va a ser igual a cero porque al llegar 
        el momento de calcular los minutos no queda residuo para 
        hacer la division y que hallaria los segundos */
        System.out.println(horas + " horas");
        System.out.println(minutos + " minutos");
        System.out.println(segundos + " segundos");
    }
}
