import java.util.Scanner;

/**
 * Nombre: Ejercicio6
 *
 * @author Adrián
 * @version 1.0
 */
public class Ejercicio6 {
    /**
     * Hace las llamadas
     *
     * @param args
     */
    public static void main(String[] args) {

        adivinar();

    }

    /**
     * Crea un número aleatorio entre 1 y 100
     *
     * @return numeroAleatorio: Un número aleatorio
     */
    public static int numeroAleatorio() {
        final int numeroAleatorio = (int) (Math.random() * (100 - 1) + 1);
        return numeroAleatorio;

    }

    /**
     * Cuerpo del programa, comprueba si un número que pregunta al usuario y un número aleatorio son iguales y da una pista al fallar, además de 5 intentos
     */
    public static void adivinar() {
        Scanner guardar = new Scanner(System.in);

        for (int i = 5; i >= 1; i--) {
            System.out.println("\n" + "Tiene " + i + " intentos");
            System.out.println("Introduzca un número");
            int numero = guardar.nextInt();


            if (numero == numeroAleatorio()) {
                System.out.println("Has acertado!");
                break;
            } else {
                System.out.println("Numero incorrecto");
            }
        }
    }
}