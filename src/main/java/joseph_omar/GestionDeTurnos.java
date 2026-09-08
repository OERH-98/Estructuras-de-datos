package joseph_omar;

import java.util.LinkedList;

public class GestionDeTurnos {
    private LinkedList<String> cola = new LinkedList<>();

    public Void agregarClienteNormal(String nombre){

        cola.addLast(nombre);
        System.out.println("Cliente normal: " +nombre + " Agregado");

        return null;

    }

    public Void agregarClienteVIP(String nombre){

        cola.addFirst(nombre);
        System.out.println("Cliente VIP: " +nombre + " Agregado");

        return null;

    }

    public Void atenderSiguienteCliente(){


        if (!cola.isEmpty()){
            String atendido = cola.pollFirst();
            System.out.println("Atendiendo a: " + atendido);

            System.out.println("Lista de clientes pendientes por atender: " + cola);
        }else{
            System.out.println("No hay clientes en la cola");
        }
    return null;
    }
}
