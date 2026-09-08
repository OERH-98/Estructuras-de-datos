package joseph_omar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner escaneador = new Scanner(System.in);

        Integer opcion = 0;

        do{
            System.out.println("Bienvenido al Menú de Acciones, ¿que desea hacer?");
            System.out.println("\nElija las Siguientes Opciones:");
            System.out.println("1-Gestión de Turnos bancarios");
            System.out.println("2-Salir");
try{
    opcion = Integer.parseInt(String.valueOf(escaneador.nextInt()));
}catch (Exception e){
    System.out.println("Error en la capa 8" + e);
}

            switch (opcion){
                case 1:
                    System.out.println("Bienvenido a la gestión de turno, se le gestionara el turno");
                    break;
                case 2:
                    System.out.println("Saliendo del programa, que tenga un lindo día mi estimado");
                    break;
                default:
                    System.out.println("Opción no valida intente de nuevo");
                    break;
            }
        } while (opcion !=2);

    }
}