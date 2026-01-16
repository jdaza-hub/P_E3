/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controldeasistencia;

/**
 *
 * @author labesp
 */
public class Estudiante {
    private String nombre;
    private int[] asistencia;

    public Estudiante(String nombre, int[] asistencia) {
        this.nombre = nombre;
        this.asistencia = asistencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(int[] asistencia) {
        this.asistencia = asistencia;
    }
    
}
