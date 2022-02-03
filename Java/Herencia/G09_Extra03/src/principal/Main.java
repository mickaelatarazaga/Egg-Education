/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

Una compañía de promociones turísticas desea mantener información sobre la
infraestructura de alojamiento para turistas, de forma tal que los clientes puedan
planear sus vacaciones de acuerdo a sus posibilidades. Los alojamientos se
identifican por un nombre, una dirección, una localidad y un gerente encargado
del lugar. La compañía trabaja con dos tipos de alojamientos: Hoteles y
Alojamientos Extrahoteleros. 

Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas,
Cantidad de Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco
estrellas. Las características de las distintas categorías son las siguientes:
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos,
Gimnasio, Nombre del Restaurante, Capacidad del Restaurante, Precio de las
Habitaciones.
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos,
Gimnasio, Nombre del Restaurante, Capacidad del Restaurante, Cantidad
Salones de Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio
de las Habitaciones.

Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo
“B”, de acuerdo a las prestaciones observadas. Las limosinas están disponibles
para cualquier cliente, pero sujeto a disponibilidad, por lo que cuanto más
limosinas tenga el hotel, más caro será. 

El precio de una habitación debe calcularse de acuerdo a la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por
restaurante) + (valor agregado por gimnasio) + (valor agregado por limosinas).
Donde:

Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.

Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.

Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.

En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los
de los hoteles, estando más orientados a la vida al aire libre y al turista de bajos
recursos. Por cada Alojamiento Extrahotelero se indica si es privado o no, así
como la cantidad de metros cuadrados que ocupa. Existen dos tipos de
alojamientos extrahoteleros: los Camping y las Residencias. Para los Camping se
indica la capacidad máxima de carpas, la cantidad de baños disponibles y si
posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y
si posee o no campo deportivo. 

Realizar un programa en el que se representen todas las relaciones descriptas. 
Realizar un sistema de consulta que le permite al usuario consultar por diferentes
criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.

 */
package principal;

import entidades.*;
import enumeradores.Gimnasio;
import java.util.ArrayList;
import servicios.ServiciosAlojamiento;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        Hotel4Estrellas h1 = new Hotel4Estrellas();
//        h1.creaHotel4E();
//        Hotel5Estrellas h2 = new Hotel5Estrellas();
//        h2.creaHotel5E();
//        
//        Camping h3 = new Camping();
//        h3.creaCamping();
//        Residencia h4 = new Residencia();
//        h4.creaResidencia();
        ArrayList<Alojamiento> lista = new ArrayList();
        Hotel4Estrellas h1 = new Hotel4Estrellas("El Chori Loco", 40, Gimnasio.A, 50, 70, 3, "Hotelo", "Oscuridad 69", "Tangamandapio", "Sevelinda Parada");
        h1.precioHabitacion();
        lista.add(h1);
        Hotel4Estrellas h2 = new Hotel4Estrellas("Que se Come", 80, Gimnasio.A, 40, 45, 2, "El Sinestrellas", "Juan V. Poco 111", "Chapanay", "Micho Tito");
        h2.precioHabitacion();
        lista.add(h2);
        Hotel5Estrellas h3 = new Hotel5Estrellas(1, 5, 2, "El Salpicon", 80, Gimnasio.A, 100, 150, 6, "MejorSolo", "Juan D. Perron 450", "Ugarteche", "Elber Galarga");
        h3.precioHabitacion();
        lista.add(h3);
        Hotel5Estrellas h4 = new Hotel5Estrellas(2, 15, 5, "Puchero's", 50, Gimnasio.A, 80, 90, 20, "El Descanso", "Parque Chachingo", "Maipu", "Dolores D'Lano");
        h4.precioHabitacion();
        lista.add(h4);
        Camping h5 = new Camping(120, 3, true, false, 2000, "El Resbalon", "Lamatriz 574", "Colonia Bombal", "Mary Conazo");
        lista.add(h5);
        Camping h6 = new Camping(150, 4, false, false, 2500, "Carrizal de Abajo", "El pejerrey 54", "Carrizal", "Elba Gallo");
        lista.add(h6);
        Residencia h7 = new Residencia(10, false, true, true, 200, "La Posada de Cacho", "Av. Corrientes 45", "Bs As", "Juan DeLospalotes");
        lista.add(h7);
        Residencia h8 = new Residencia(15, true, true, false, 250, "Engañao", "Ituzaingo 78", "Mendoza", "Jose Cuernos");
        lista.add(h8);
        
        ServiciosAlojamiento sa = new ServiciosAlojamiento();
        sa.menu(lista);
        
    }
    
}
