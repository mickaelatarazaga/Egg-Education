/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.
 */
package ej06.servicios;

import ej06.entidades.Ahorcado;
import java.util.Scanner;


public class ServiciosAhorcado {
/*
Creo un vector de caracteres para ir mostrando las letras encontradas
de forma estatica como variable de la clase para que otros metodos puedan
acceder a este vector para asignarle valores, recorrerlo y mostrarlo.
*/
    private static char[] mostrar = new char[40];

/*
Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas 
máxima. Con la palabra del usuario, pone la longitud de la palabra, como la 
longitud del vector. Después ingresa la palabra en el vector, letra por 
letra, quedando cada letra de la palabra en un índice del vector. Y también, 
guarda en cantidad de jugadas máximas, el valor que ingresó el usuario y 
encontradas en 0.
*/
    public Ahorcado crearJuego() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa la Palabra para adivinar");
        String letras = leer.next().toLowerCase();
        System.out.println("Ingresa la cantidad de jugadas maximas");
        int cantJug = leer.nextInt();
        //por cada juego creo un vector igual al tamaño de la palabra para mostrar cada letra encontrada
        char m[] = new char[letras.length()];
        //lleno el vector m con guiones segun el tamaño de la palabra
        for (int i = 0; i < m.length; i++) {
            mostrar[i] = '_';
        }
        mostrar = m;//asigno el vector de guiones al vector mostrar estatico
        return new Ahorcado(letras, 0, cantJug);
    }

    /*
Método longitud(): muestra la longitud de la palabra que se debe encontrar. 
Nota: buscar como se usa el vector.length.*/
    private static void longitud(Ahorcado a) {
        System.out.println("La Palabra a buscar tiene " + a.getPalabra().length + " letras");
    }

    /*
Método buscar(letra): este método recibe una letra dada por el usuario y 
busca si la letra ingresada es parte de la palabra o no. También informará si 
la letra estaba o no.*/
    private static boolean buscarLetra(Ahorcado a, char letra) {
        for (int i = 0; i < a.getPalabra().length; i++) {
            if (a.getPalabra()[i] == letra) {
                return true;
            }
        }
        return false;
    }

    /*
Método encontradas(letra): que reciba una letra ingresada por el usuario y 
muestre cuantas letras han sido encontradas y cuantas le faltan. Este método 
además deberá devolver true si la letra estaba y false si la letra no estaba, 
ya que, cada vez que se busque una letra que no esté, se le restará uno a 
sus oportunidades.*/
    private static void encontradas(Ahorcado a) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int cuentaLetra = 0;
        int oportunidades = a.getJugadas();

        System.out.println("Ingresa la letra a buscar");
        char letra = leer.next().toLowerCase().charAt(0);

        if (buscarLetra(a, letra)) {
            System.out.println("La letra SI esta en la palabra");
            for (int i = 0; i < a.getPalabra().length; i++) {
                if (letra == a.getPalabra()[i]) {
                    cuentaLetra+=1;
                    mostrar[i] = letra;//asigno la letra al vector mostrar
                }
            }
            cuentaLetra += a.getLetrasEncontradas();
            a.setLetrasEncontradas(cuentaLetra);
            
        } else {
            System.out.println("La letra NO es parte de la palabra");
            oportunidades-=1;
            a.setJugadas(oportunidades);
        }
        //muestro el vector "mostrar" con las legras encontradas
        for (int i = 0; i < mostrar.length; i++) {
            System.out.print("[ " + mostrar[i] + " ] ");

        }
        System.out.println("");
    }

    /*
Método intentos(): para mostrar cuantas oportunidades le queda al jugador.*/
    private static void intentos(Ahorcado a) {
        System.out.println("Quedan " + a.getJugadas() + " posibles fallas");
    }

    /*
Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra
o se quede sin intentos. Este método se llamará en el main.*/
    public void juego(Ahorcado a) {
        while (a.getJugadas() > 0) {
            encontradas(a);
            longitud(a);
            intentos(a);
            if (a.getJugadas() > 1 && a.getLetrasEncontradas() == a.getPalabra().length) {
                System.out.println("MUY BIEN Ganaste!");
                break;
            }
            if (a.getJugadas() == 0) {
                System.out.println("Ahorcado!");
                break;
            }

        }
    }
}
