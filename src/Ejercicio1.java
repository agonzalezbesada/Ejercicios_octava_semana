import java.util.Scanner;

public class Ejercicio1 {

    static int [] numeros=new int[tamanoArray()];
    public static void main(String[] args) {
        Scanner guardar=new Scanner(System.in);

        boolean salir=false;

        while (salir==false){

            insertarDatos();

            verIndice();

            System.out.println("Continuar?"+"\n1. Continuar"+"\n2. Salir");
            int eleccion= guardar.nextInt();
            switch (eleccion){
                case 1: {
                    break;
                }
                case 2: {
                    salir=true;
                    break;
                }
            }

        }
    }

    public static void insertarDatos(){
        Scanner guardar= new Scanner(System.in);
        int variableFor=tamanoArray();
        for(int i=0;i<variableFor;i++){
            System.out.println("Introduzca un valor");
            numeros[i]=guardar.nextInt();
        }
    }

    public static int tamanoArray(){
        Scanner guardar=new Scanner(System.in);
        System.out.println("De qué tamaño desea el array?");
        int tamano=guardar.nextInt();
        return tamano;
    }

    public static void verIndice() {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(""+i+" "+numeros[i]);
        }

    }
}
