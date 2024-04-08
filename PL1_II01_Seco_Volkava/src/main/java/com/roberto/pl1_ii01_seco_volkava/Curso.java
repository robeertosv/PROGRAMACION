package com.roberto.pl1_ii01_seco_volkava;

import java.util.ArrayList;

public class Curso {
    private String idioma;
    private String nivel;
    private double precio;
    private Profesor profesor;
    private ArrayList<Alumno> alumnosInscritos = new ArrayList<Alumno>();

    public Curso(String idioma, String nivel, double precio, Profesor profesor) {
        this.idioma = idioma;
        this.nivel = nivel;
        this.precio = precio;
        this.profesor = profesor;
    }

    public String getIdioma() {
        return this.idioma;
    }

    public String getNivel() {
        return this.nivel;
    }

    public double getPrecio() {
        return this.precio;
    }

    public Profesor getProfesor() {
        return this.profesor;
    }

    public void setProfesor(Profesor profe) {
        this.profesor = profe;
    }

    public ArrayList<Alumno> getAlumnos() {
        return this.alumnosInscritos;
    }

    public void inscribirAlumno(Alumno alumno) {
        if (!this.alumnosInscritos.contains(alumno)) {
            this.alumnosInscritos.add(alumno);

            double tasa = precio * 0.2;

            if (alumno.getEdad() >= 65) {
                tasa *= 0.5;
            }

            alumno.setTasa(tasa);
        }
    }

    public boolean bajaAlumno(Alumno alumno) {
        boolean flag = false;

        if (this.alumnosInscritos.contains(alumno)) {
            this.alumnosInscritos.remove(alumno);
            flag = true;
        }

        return flag;
    }
}
