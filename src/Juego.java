import java.util.Scanner;

public class Juego {

    public static void igualNoIgual(){
        Scanner guardar= new Scanner(System.in);

        int numeroAleatorio=(int)(Math.random()*(1+5));
        int numeroUsuario=0;
        boolean salir=false;



        while(salir==false){
            System.out.println("\n"+"introduzca un número");
            numeroUsuario=guardar.nextInt();
            if (numeroUsuario!=numeroAleatorio){
                if (numeroUsuario>numeroAleatorio){
                    System.out.println("\n"+"El número aleatorio es menor");
                }
                if (numeroUsuario<numeroAleatorio){
                    System.out.println("\n"+"El número aleatorio es mayor");
                }
            }else{
                System.out.println("\n"+"Has acertado!");
                salir=true;
            }

        }


    }
}
