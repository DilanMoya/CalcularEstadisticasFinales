/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calcularestadisticacurso;
import java.util.ArrayList;
/**
 *
 * @author labctr
 */
public class Curso {
   private String nombre;
   private int cantidadEst;
   private float notaProm;
   private int ganadores;
   private int perdedores;
   private int semestreProm;
   
  public Curso(String nombre, int cantidadEst){
      this.nombre=nombre;
      this.cantidadEst= cantidadEst;
  }
  public void mostrarDatos(){
  }
  public void Estadisticas(ArrayList<Estudiante> Lista) {
        ganadores = 0;
        perdedores = 0;
        notaProm = 0;
        semestreProm = 0;
        float sumaNotas = 0;

        // Array para contar la frecuencia de cada semestre
        int[] frecuenciaSemestre = new int[11];  // Suponemos que los semestres van de 1 a 10

        for (Estudiante estudiante : Lista) {
            sumaNotas += estudiante.getNota();

            // Contar la frecuencia de cada semestre
            int semestre = estudiante.getSemestre();
            frecuenciaSemestre[semestre]++;

            if (estudiante.getNota() >= 14) {
                ganadores++;
            } else {
                perdedores++;
            }
        }

        notaProm = sumaNotas / cantidadEst;

        // Calcular el semestre más común
        int maxFrecuencia = 0;
        for (int semestre = 1; semestre <= 10; semestre++) {
            int frecuencia = frecuenciaSemestre[semestre];

            if (frecuencia > maxFrecuencia) {
                semestreProm = semestre;
                maxFrecuencia = frecuencia;
            }
        }  
    }

    public float getNotaProm() {
        return notaProm;
    }

    public int getGanadores() {
        return ganadores;
    }

    public int getPerdedores() {
        return perdedores;
    }

    public int getSemestreProm() {
        return semestreProm;
    }   
}
