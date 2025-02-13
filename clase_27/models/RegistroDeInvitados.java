package models;
// Esta clase será responsable de gestionar la lista de invitados. En ella declara un
//  HashSet<String> para almacenar los nombres de los invitados.
// agregarInvitado(String nombre): Agrega un nombre al HashSet. Si el nombre ya existe, no se añadirá de nuevo.

import java.util.HashSet;

// eliminarInvitado(String nombre): Elimina un nombre del HashSet, si este se encuentra registrado.

// mostrarInvitados(): Imprime por pantalla la lista actual de invitados.
public class RegistroDeInvitados {
    private HashSet<String> invitados;

    public RegistroDeInvitados() {
        invitados = new HashSet<String>();
    }

    public void agregarInvitado(String nombre) {
        invitados.add(nombre);
    }

    public void eliminarInvitado(String nombre) {
        if (invitados.remove(nombre)) { // `remove` devuelve true si se eliminó correctamente
            System.out.println("Invitado eliminado con éxito.");
        } else {
            System.out.println("El invitado no se encuentra en la lista.");
        }
    }

    public void mostrarInvitados() {
        System.out.println("Lista de invitados:");
        if (invitados.isEmpty()) {
            System.out.println("La lista no contiene datos");
        } else {
            for (String invitado : invitados) {
                System.out.println(invitado);
            }
        }
    }

}
