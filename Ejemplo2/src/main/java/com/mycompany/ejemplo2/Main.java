
package com.mycompany.ejemplo2;

public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setNombre("Juan");
        persona.setEdad(25);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
    }
}
