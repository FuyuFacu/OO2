package org.example;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Persona p1 = new Persona("joaquin", 50);
        Persona p2 = new Persona("franco", 70);
        Persona p3 = new Persona("batistuta", 327);

        LocalDate fecha = LocalDate.of(2025, 11, 10);
        
        Projecto P = new Projecto(LocalDate.now(), fecha, "salir con amigos", 600);
        
        P.agregarPersona(p1);
        P.agregarPersona(p2);
        P.agregarPersona(p3);

        P.aprobarProjecto();


    }
}