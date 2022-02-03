/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de
Jugadores) y Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
jugadores y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de 
agua y aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se
termina el juego, sino se moja, se pasa al siguiente jugador hasta que uno se 
moje. Si o si alguien se tiene que mojar. Al final del juego, se debe mostrar
que jugador se mojó. Pensar la lógica necesaria para realizar esto, usando los
atributos de la clase Juego.

 */
package ej_02.servicio;

import ej_02.entidades.*;
import java.util.*;


public class RuletaRusa {

    Set<Jugador> jugadores;
    Revolver colt;

    /**
     * Constructor vacio pero que instancia al Conjunto de Jugadores
     */
    public RuletaRusa() {
        this.colt = new Revolver();
        this.jugadores = new HashSet();
    }

    /**
     * Metodo que arma la Mesa de Juego, llena el conjunto de jugadores que no
     * pueden ser mas de 6 e instancia el revolver.
     *
     * @param cantJugadores <=6
     */
    public void armaMesa(int cantJugadores) {

        if (cantJugadores > 6 || cantJugadores <= 0) {
            cantJugadores = 6;
        }

        for (int i = 0; i < cantJugadores; i++) {
            Jugador j = new Jugador();
            j.setId(i + 1);
            j.setMuerto(false);
            jugadores.add(j);
        }

    }

    public void ronda() {
        int cont = 1;
        Jugador j = new Jugador();
        boolean bandera = false;
        do {
            for (Jugador aux : jugadores) {
                System.out.println("RONDA "+cont);
                cont++;
                j = aux;
                colt.siguienteTiro();
                if (colt.muerto()) {
                    j.setMuerto(true);
                    bandera = true;
                    System.out.println(j.toString());
                    break;
                }
            }
        } while (!bandera);

    }

    public void muestraJugadores() {
        jugadores.forEach(jugador -> {
            System.out.println(jugador);
        });
    }

}
