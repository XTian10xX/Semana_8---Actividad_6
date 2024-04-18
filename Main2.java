import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        adivinarNumero(1, 100, 5);
    }

    // Método para calcular las deducciones
    public static void adivinarNumero(int min_numero, int max_numero, int max_intentos) {
        // Implementar solución
        Scanner scanner = new Scanner(System.in);

        System.out.println("Generando número aleatorio entre 0 a 100...");

        int numeroSecretoAleatorio = (int) (Math.random() * (max_numero - min_numero + 1));

        System.out.println("EMPEZO EL JUEGO");

        System.out.println("---------------------------");

        System.out.print("Para empezar, inserta un numero entre " + min_numero + " y " + max_numero + ": ");

        do {
            int intentoUsuario = scanner.nextInt();
            if (intentoUsuario == numeroSecretoAleatorio) {
                System.out.println("¡Felicidades, Adivinaste el número aleatorio. Ganaste!");
            } else {
                System.out.println("Lo siento, ese no es el número aleatorio. Intenta otra vez...");
                max_intentos--;
            }

            if (intentoUsuario < numeroSecretoAleatorio) {
                System.out.println("Pista: El número aleatorio es mayor que " + intentoUsuario);
            } else {
                System.out.println("Pista: El número aleatorio es menor que " + intentoUsuario);
            }
        } while (max_intentos != 0);
        {
        System.out.println("Lo siento, te quedaste sin intentos. El número aleatorio era " + numeroSecretoAleatorio);
    }
    scanner.close();
 }
}
