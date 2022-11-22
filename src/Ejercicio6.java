import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        adivinar();

    }

    public static int numeroAleatorio(){
        final int numeroAleatorio= (int)(Math.random()*(100-1)+1);
        return numeroAleatorio;

    }

    public static void adivinar(){
        Scanner guardar=new Scanner(System.in);

        for (int i=5;i>=1;i--){
            System.out.println("\n"+"Tiene "+i+" intentos");
            System.out.println("Introduzca un número");
            int numero=guardar.nextInt();


            if (numero==numeroAleatorio()){
                System.out.println("Has acertado!");
                break;
            }else{
                System.out.println("Numero incorrecto");
            }
        }
    }
}