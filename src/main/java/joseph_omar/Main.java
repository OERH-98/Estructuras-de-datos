package joseph_omar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner nombre = new Scanner(System.in);

        Integer opcion = 0;

        GestionDeTurnos gestionDeTurnos = new GestionDeTurnos();

        do{
            System.out.println("\nBienvenido al Menú de Acciones, ¿que desea hacer?");
            System.out.println("\nElija las Siguientes Opciones:");
            System.out.println("1-Agregar Cliente normal");
            System.out.println("2-Agregar Cliente VIP");
            System.out.println("3-Atender al siguiente cliente");
            System.out.println("4-Salir de la interfaz");

            Scanner escaneador = new Scanner(System.in);

            try {
                opcion = Integer.parseInt(String.valueOf(escaneador.nextInt()));

            String cliente;

            switch (opcion) {
                case 1:
                    System.out.println("Bienvenido al apartado de agregar clientes normales, por favor, escriba su nombre");
                    gestionDeTurnos.agregarClienteNormal(cliente = nombre.nextLine());
                    break;
                case 2:
                    System.out.println("Bienvenido al apartado de agregar clientes VIP, por favor, escriba su nombre");
                    gestionDeTurnos.agregarClienteVIP(cliente = nombre.nextLine());
                    break;
                case 3:
                    System.out.println("Atender al siguiente cliente");
                    gestionDeTurnos.atenderSiguienteCliente();
                    break;
                case 4:
                    System.out.println("Saliendo de la interfaz, que tenga un lindo día");
                    break;
                default:
                    System.out.println("Opción no valida intente de nuevo");
                    break;
            }
            } catch (Exception e) {
                System.out.println("Error, Escribe una opción valida");
            }
        } while (opcion !=4);
        System.out.println("ERROR");
    }
}