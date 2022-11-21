import java.util.Scanner;

public class E_S {

    public static String solicitarcadena(String cadena){
        Scanner guardar= new Scanner(System.in);
        System.out.println("\n"+cadena);
        String cadenadevuelta=guardar.nextLine();
        return cadenadevuelta;

    }
    public static int solicitarentero(String cadena){
        Scanner guardar= new Scanner(System.in);
        System.out.println("\n"+cadena);
        int enterodevuelto=guardar.nextInt();
        return enterodevuelto;
    }
    public static void mostrarcadena(String cadena){
        System.out.println("\n"+cadena);
    }
}
