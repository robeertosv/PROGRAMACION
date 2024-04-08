package com.roberto.pl1_ii01_seco_volkava;

public class PL1_II01_Seco_Volkava {

    public static void main(String[] args) {
        Academia academia = new Academia("Academia Roberto");
        Profesor profesorIngles = new Profesor("Pepe González", "12345678A", "Inglés");
        Profesor profesorFrances = new Profesor("Lucas García", "87654321A", "Francés");
        Pas pas = new Pas("Javier Gutiérrez", "33567789A", "Recepción");

        Curso ingles = new Curso("Inglés", "Principiante", 10, profesorIngles);
        Curso frances = new Curso("Francés", "Avanzado", 40, profesorFrances);

        academia.addCurso(ingles);
        academia.addCurso(frances);

        System.out.println(academia.listadoCursos());
        System.out.println();
        System.out.println("En recepción está " + pas.getNombre());
        System.out.println();

        Alumno roberto = new Alumno("Roberto Seco", "09854422A", 18, 1, ingles);
        Alumno luis = new Alumno("Luis Pérez", "33657788R", 70, 2);
        luis.addCurso(frances);

        ingles.inscribirAlumno(roberto);
        frances.inscribirAlumno(luis);

        System.out.println("Tasa que pagará Roberto por inscribirse a " + roberto.getCurso().getIdioma() + " = "+ roberto.getTasa() +"$");
        System.out.println("Tasa que pagará Luis por inscribirse a " + luis.getCurso().getIdioma() + " = "+ luis.getTasa() +"$");

        profesorIngles.calificarAlumno(roberto, 10);
        profesorFrances.calificarAlumno(luis, 6);

        System.out.println("Alumnos en inglés: " + ingles.getAlumnos());
        System.out.println();
        System.out.println("Alumnos en francés: " + frances.getAlumnos());
        System.out.println();

        System.out.println("El alumno de frances quiere darse de baja: ");
        frances.bajaAlumno(luis);

        System.out.println("Alumnos en francés: " + frances.getAlumnos());
        System.out.println();
    }
}
