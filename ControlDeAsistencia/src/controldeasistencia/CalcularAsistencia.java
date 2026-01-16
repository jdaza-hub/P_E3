/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controldeasistencia;

/**
 *
 * @author labesp
 */
public class CalcularAsistencia implements Aistencia{

    @Override
    public double calcularPorcentaje(int[] asistencias) {
        int asistio = 0;

        for (int i = 0; i < asistencias.length; i++) {
            if (asistencias[i] == 1) {
                asistio++;
            }
        }

        return (asistio * 100.0) / asistencias.length;
    }}
    
    
