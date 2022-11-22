
import java.util.Scanner;

public class Ejercicio3 {



    public static void main(String[] args) {

        asignarAleatorio(pedirTamanoArray());

    }

    public static int pedirTamanoArray(){

        Scanner guardar=new Scanner(System.in);
        System.out.println("De qué tamaño desea el array?");
        int tamano= guardar.nextInt();
        return tamano;
    }
    public static void asignarAleatorio(int tamano){

        int[]numeros=new int[tamano];
        for(int i=0;i<tamano;i++){
            numeros[i]= (int) (Math.random() * (100-1)+1);
            System.out.println(numeros[i]);
        }
    }
}
