package joseph_omar;

import java.util.LinkedList;

public class GestionDeTurnos {
    private LinkedList<String> cola = new LinkedList<>();
    public Void agregarClienteNormal(String nombre){
<<<<<<< HEAD
        cola.addLast(nombre);
        System.out.println("Cliente normal: " +nombre + "Agregado");
=======

>>>>>>> 870dfbf14052858168580200d44029c4362e0de1
        return null;

    }

    public Void agregarClienteVIP(String nombre){
<<<<<<< HEAD
        cola.addFirst(nombre);
        System.out.println("Cliente VIP: " +nombre + "Agregado");
=======

>>>>>>> 870dfbf14052858168580200d44029c4362e0de1
        return null;

    }

    public Void atenderSiguienteCliente(){
<<<<<<< HEAD
        if (!cola.isEmpty()){
            String atendida = cola.pollFirst();
            System.out.println();
        }
=======

>>>>>>> 870dfbf14052858168580200d44029c4362e0de1
        return null;

    }
}
