/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Cantidad Salones de Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio
de las Habitaciones.

 */
package entidades;

import enumeradores.Gimnasio;
import java.util.Scanner;

public class Hotel5Estrellas extends Hotel4Estrellas {

    private Integer cantSalonDeConferencias, cantDeSuits, cantDeLimosinas;

    public Hotel5Estrellas() {
    }

    public Hotel5Estrellas(Integer cantSalonDeConferencias, Integer cantDeSuits, Integer cantDeLimosinas, String nombRestaurant, Integer capRestaurante, Gimnasio gym, Integer cantHabitaciones, Integer nroCamas, Integer cantPisos, String nombre, String direccion, String localidad, String gerente) {
        super(nombRestaurant, capRestaurante, gym, cantHabitaciones, nroCamas, cantPisos, nombre, direccion, localidad, gerente);
        this.cantSalonDeConferencias = cantSalonDeConferencias;
        this.cantDeSuits = cantDeSuits;
        this.cantDeLimosinas = cantDeLimosinas;
    }

    public Integer getCantSalonDeConferencias() {
        return cantSalonDeConferencias;
    }

    public void setCantSalonDeConferencias(Integer cantSalonDeConferencias) {
        this.cantSalonDeConferencias = cantSalonDeConferencias;
    }

    public Integer getCantDeSuits() {
        return cantDeSuits;
    }

    public void setCantDeSuits(Integer cantDeSuits) {
        this.cantDeSuits = cantDeSuits;
    }

    public Integer getCantDeLimosinas() {
        return cantDeLimosinas;
    }

    public void setCantDeLimosinas(Integer cantDeLimosinas) {
        this.cantDeLimosinas = cantDeLimosinas;
    }

    public void creaHotel5E() {
        super.creaHotel4E();
        System.out.println("Salones y Suits:");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cuantos Salones de Eventos tiene?");
        this.cantSalonDeConferencias = leer.nextInt();
        System.out.println("Cantidad de SUITs");
        this.cantDeSuits = leer.nextInt();
    }

    @Override
    public void precioHabitacion() {
        super.precioHabitacion();
        super.precioHabitacion += this.cantDeLimosinas * 15;

    }

    @Override
    public String toString() {
        System.out.print(super.toString());
        return cantDeSuits + " Suits y, " + cantDeLimosinas + " Limusinas";
    }

    
    
}
