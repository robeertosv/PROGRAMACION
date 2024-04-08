package com.roberto.pl1_ii01_seco_volkava;

import java.util.ArrayList;

public class Academia {
    private ArrayList<Curso> cursos = new ArrayList<Curso>();
    private String nombreAcademia;

    public Academia(String nombreAcademia) {
        this.nombreAcademia = nombreAcademia;
    }

    public ArrayList<Curso> getCursos() {
        return this.cursos;
    }

    public void addCurso(Curso curso) {
        if (!this.cursos.contains(curso)) {
            this.cursos.add(curso);
        }
    }

    public String getNombre() {
        return this.getNombre();
    }

    public String listadoCursos() {
        String info = "--- " + this.nombreAcademia + " ---\nCursos:";

        for (Curso curso : cursos) {
            info += "\n - " + curso.getIdioma() + ", Nivel: " + curso.getNivel() + ", Precio: " + curso.getPrecio()
                    + ", Profesor: " + curso.getProfesor().getNombre();
        }

        return info;
    }
}
