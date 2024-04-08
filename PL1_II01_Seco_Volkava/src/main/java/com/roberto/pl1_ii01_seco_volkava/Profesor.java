package com.roberto.pl1_ii01_seco_volkava;

public class Profesor extends Persona {
    private String materia;

    public Profesor(String nombre, String DNI, String materia) {
        super(nombre, DNI);
        this.materia = materia;
    }

    public String getMateria() {
        return this.materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void calificarAlumno(Alumno alumno, double nota) {
        alumno.setCalificacion(nota);
    }
}
