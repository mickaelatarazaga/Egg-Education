/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Clase Persona: con atributos: nombre, apellido, edad, documento y Perro.
 */
package entidades;

public class Persona {

    private String nombre, apellido;
    private Integer edad;
    private long dni;
    private Perro mascota;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, long dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public Perro getMascota() {
        return mascota;
    }

    public void setMascota(Perro mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "\nPersona: " + nombre + " " + apellido + "\nEdad: " + edad + " DNI Nro.: " + dni + "\nPerro: " + mascota.toString();
    }

}
