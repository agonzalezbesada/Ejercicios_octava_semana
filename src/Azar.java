import java.util.Scanner;
import java.lang.Math;

public class Azar {

    public static int pedirMinimo(int minimo){
        Scanner guardar= new Scanner(System.in);

        System.out.println("Escriba el mínimo");
        minimo= guardar.nextInt();
        return minimo;
    }

    public static int pedirMaximo(int maximo){
        Scanner guardar= new Scanner(System.in);

        System.out.println("Escriba el máximo");
        maximo=guardar.nextInt();
        return maximo;
    }
    public static int devolverEntero(int minimo, int maximo){
        int entero = (int)(Math.random()*(maximo-minimo)+minimo);
        return entero;
    }
}
