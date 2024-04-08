package com.roberto.pl1_ii01_seco_volkava;

public class Pas extends Persona {
    private String categoria;

    public Pas(String nombre, String DNI, String categoria) {
        super(nombre, DNI);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return this.categoria;
    }

}
