/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa
va a tener que contar con muchas personas y muchos perros. El programa deberá
preguntarle a cada persona, que perro según su nombre, quiere adoptar. Dos personas
no pueden adoptar al mismo perro, si la persona eligió un perro que ya estaba adoptado,
se le debe informar a la persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package servicio;

import entidades.*;
import enumeradores.*;
import java.util.*;


public class ServicioAdopcion {

    Scanner leer;
    ArrayList<Perro> adoptados;
    ArrayList<String> nombres;

    public ServicioAdopcion() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.adoptados = new ArrayList();
        this.nombres = new ArrayList();

        nombres.add("KHALIFA");
        nombres.add("PULGAS");
        nombres.add("CUAL");
        nombres.add("MORTADELA");
        nombres.add("CHUFLI");
        nombres.add("MONCHO");
        nombres.add("NEGRO");
        nombres.add("NARIGON");
        nombres.add("CHICHO");
        nombres.add("XUXA");

    }

    public void adoptaPerro(Persona per) {
        System.out.println("** LISTA DE NOMBRES DISPONIBLES **");
        nombres.forEach(nomb -> {
            System.out.print(nomb + ", ");
        });

        System.out.println("\nElije uno...");
        String sele = leer.next().toUpperCase();

        Perro p = new Perro();
        if (nombres.contains(sele)) {
            p = razaTamanio(p);
            p.setNombre(sele);
            per.setMascota(p);
            nombres.remove(sele);
            adoptados.add(p);
            System.out.println(per.getNombre() + " " + per.getApellido() + " adopta a: " + p.toString());
        } else {
            System.out.println("Ese nombre no le queda, la proxima elije uno de la lista");
        }
    }

    public void personaAdopta(ArrayList<Persona> listaPersona) {

        for (Persona aux : listaPersona) {
            System.out.println("\nHola!! " + aux.getNombre().toUpperCase() + " " + aux.getApellido().toUpperCase() + " vamos a adoptar un perro");
            adoptaPerro(aux);
        }

    }

    private Perro razaTamanio(Perro choco) {
        System.out.println("*******RAZAS******");
        //recorre desde los valores del enum Raza y por cada vuelta del for
        // le asigna un valor del enum a la variable aux.
        for (Raza aux : Raza.values()) {
            System.out.println(aux);
        }
        System.out.println("*******TAMAÑOS******");
        for (Tamanio aux : Tamanio.values()) {
            System.out.println(aux);
        }

        System.out.println("\nElija la raza y el tamaño");
        String eleRaza = leer.next();
        String eleTam = leer.next();

        for (Raza aux : Raza.values()) {
//si lo que escribio el usuario es igual a el objeto auxiliar del enum convertido a String
            if (eleRaza.equalsIgnoreCase(aux.toString())) {
                choco.setRaza(aux);
            }
        }

        for (Tamanio aux : Tamanio.values()) {
            if (eleTam.equalsIgnoreCase(aux.toString())) {
                choco.setTamanio(aux);
            }

        }
        return choco;
    }

}
