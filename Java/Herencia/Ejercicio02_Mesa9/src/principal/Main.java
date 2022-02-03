/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios
para mostrar el precio final de los dos electrodomésticos


 */
package principal;

import entidades.*;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lavarropa l = new Lavarropa();
        Televisor t = new Televisor();

        l.crearLavarropa();
        l.precioFinal();
        System.out.println(l);
        t.crearTelevisor();
        t.precioFinal();
        System.out.println(t);

    }

}
