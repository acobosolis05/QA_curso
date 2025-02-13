package models;

import java.util.ArrayList;
import java.util.HashSet;

public class GestorContactos {
    private ArrayList<Contacto> contactosArrayList;
    private HashSet<Contacto> contactosHashSet;

    // En el constructor de la clase GestorDeContactos, inicializa los campos
    // contactosArrayList
    public GestorContactos() {
        contactosArrayList = new ArrayList<>();
        contactosHashSet = new HashSet<>();
    }

    // Implementa el método agregarContactoArrayList que reciba como parámetro un
    // objeto de
    // la clase Contacto y lo agregue al ArrayList, asegurándote de no permit
    // ir contactos duplicados.
    public void agregarContactoArrayList(Contacto contacto) {
        if (!contactosArrayList.contains(contacto)) {
            contactosArrayList.add(contacto);
        }
    }

    public void eliminarContactoArrayList(Contacto contacto) {
        if (contactosArrayList.remove(contacto)) {
            System.out.println("Contacto eliminado con éxito");
        } else {
            System.out.println("Contacto no encontrado");
        }
    }

    // Implementa el método agregarContactoHashSet que realice la misma función que
    // agregarContactoArrayList, pero esta vez agregando contactos al HashSet.
    public void agregarContactoHashSet(Contacto contacto) {
        contactosHashSet.add(contacto);
    }

    public void eliminarContactoHashSet(Contacto contacto) {
        if (contactosHashSet.remove(contacto)) {
            System.out.println("Contacto eliminado con éxito");
        } else {
            System.out.println("Contacto no encontrado");
        }
    }

}
