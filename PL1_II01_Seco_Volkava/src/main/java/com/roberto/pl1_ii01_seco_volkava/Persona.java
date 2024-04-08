package com.roberto.pl1_ii01_seco_volkava;

public class Persona {
    private String nombre;
    private String DNI;

    public Persona(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDNI() {
        return this.DNI;
    }
}
