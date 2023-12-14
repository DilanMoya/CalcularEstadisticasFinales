/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calcularestadisticacurso;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author labctr
 */
public class CalcularEstadisticaCurso {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        ArrayList<Estudiante> lista= new ArrayList<>();

        System.out.print("Escribe el nombre del Curso: ");
        String nombre= leer.next();
        System.out.print("Escribe el numero de estudiantes: ");
        int cantidadEst= leer.nextInt();

        Curso curso = new Curso(nombre, cantidadEst);

        for(int i=0;i<cantidadEst;i++){
        System.out.print("Escribe la nota del estudiante N°"+ (i+1) + " = ");
        float nota = leer.nextFloat();
        System.out.print("Escribe el semestre del estudiante N°"+ (i+1) + " = ");
        int semestre = leer.nextInt();
        
        Estudiante estudiante = new Estudiante(nota,semestre);
        lista.add(estudiante);
        }
        
        curso.Estadisticas(lista);
        System.out.println("La nota Promedio del curso es: "+ curso.getNotaProm());
        System.out.println("Los estudiantes que perdieron son: "  + curso.getPerdedores() + " PERDEDORES");
        System.out.println("Los estudiantes que GANARON son: " + curso.getGanadores() +" GANADORES");
        System.out.println("El Promedio de los Semestres es: " + curso.getSemestreProm());       
    }
}
