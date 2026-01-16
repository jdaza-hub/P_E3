/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controldeasistencia;

/**
 *
 * @author labesp
 */
public class Mostrar {
    public void mostrar(String nombre, double porcentaje, boolean cumple) {
        System.out.println("\n--- REPORTE DE ASISTENCIA ---");
        System.out.println("Estudiante: " + nombre);
        System.out.println("Porcentaje de asistencia: " + porcentaje + "%");

        if (cumple) {
            System.out.println("Estado: CUMPLE");
        } else {
            System.out.println("Estado: NO CUMPLE");
        }
    }
}
