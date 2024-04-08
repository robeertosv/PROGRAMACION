package com.roberto.pl1_ii01_seco_volkava;

public class Alumno extends Persona {
    private int edad;
    private int ID;
    private Curso curso;
    private double calificacion;
    private double tasa;

    public Alumno(String nombre, String DNI, int edad, int ID, Curso curso) {
        super(nombre, DNI);
        this.ID = ID;
        this.edad = edad;
        this.curso = curso;
    }

    public Alumno(String nombre, String DNI, int edad, int ID) {
        super(nombre, DNI);
        this.ID = ID;
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public int getID() {
        return this.ID;
    }

    public Curso getCurso() {
        return this.curso;
    }

    public void addCurso(Curso curso) {
        this.curso = curso;
    }

    public double getCalificacion() {
        return this.calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public double getTasa() {
        return this.tasa;
    }

    public void setTasa(double tasa) {
        this.tasa = tasa;
    }

    private String getCalificacionAsString() {
        String ret = "";

        if (this.calificacion >= 0 && this.calificacion <= 4.9) {
            ret = "SUSPENSO";
        } else if (this.calificacion >= 5 && this.calificacion <= 6.9) {
            ret = "APROBADO";
        } else if (this.calificacion >= 7 && this.calificacion <= 8.9) {
            ret = "NOTABLE";
        } else if (this.calificacion >= 9 && this.calificacion <= 10) {
            ret = "SOBRESALIENTE";
        } else {
            ret = "ERROR";
        }

        return ret;
    }

    public String toString() {
        return "Nombre: " + this.getNombre() + "\nDNI: " + this.getDNI() + "\nCalificación: " + this.getCalificacion()
                + " (" + this.getCalificacionAsString() + ")";
    }

}
