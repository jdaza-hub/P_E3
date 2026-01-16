/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controldeasistencia;

import java.util.Scanner;

/**
 *
 * @author labesp
 */
public class ControlDeAsistencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese cantidad de dias:");
        int n=sc.nextInt();
    
        int[] asistencias = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Día " + (i + 1) + " (1=Asistió, 0=Faltó): ");
            asistencias[i] = sc.nextInt();
        }

        Estudiante estudiante = new Estudiante(nombre, asistencias);

        CalcularAsistencia calcular = new CalcularAsistencia();

        double porcentaje = calcular.calcularPorcentaje(estudiante.getAsistencia());

        VerificarES verificar = new VerificarES();
        boolean cumple = verificar.cumple(porcentaje);

        Mostrar reporte = new Mostrar();
        reporte.mostrar(estudiante.getNombre(), porcentaje, cumple);

        sc.close();
    }
    }
    
