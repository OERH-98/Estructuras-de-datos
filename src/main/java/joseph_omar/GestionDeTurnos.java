package joseph_omar;

import java.util.LinkedList;

public class GestionDeTurnos {
    private LinkedList<String> cola = new LinkedList<>();
    public Void agregarClienteNormal(String nombre){
        cola.addLast(nombre);
        System.out.println("Cliente normal: " +nombre + "Agregado");
        return null;
    }

    public Void agregarClienteVIP(String nombre){
        cola.addFirst(nombre);
        System.out.println("Cliente VIP: " +nombre + "Agregado");
        return null;
    }

    public Void atenderSiguienteCliente(){
        if (!cola.isEmpty()){
            String atendida = cola.pollFirst();
            System.out.println();
        }
        return null;
    }
}
