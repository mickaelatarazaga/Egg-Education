/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package ej01.servicios;

import ej01.entidades.Libro;
import java.util.Scanner;


public class ServiciosLibros {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libro crearLibro() {
        System.out.println("Ingresa el ISNB del Libro");
        String isnb = leer.next();
        System.out.println("Ingresa el Titulo del Libro");
        String titulo = leer.next();
        System.out.println("Ingresa el Autor del Libro");
        String autor = leer.next();
        System.out.println("Ingresa la cantidad de Paginas");
        int nroPaginas = leer.nextInt();

        return new Libro(isnb, titulo, autor, nroPaginas);

    }
}
