package EstudianteIGU;

import javax.swing.*;

public class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;
    private double nota1;
    private double nota2;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if (nota1 > 0 && nota1 <= 10) {
            this.nota1 = nota1;
        } else {
            this.nota1 = 0;
        }
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if (nota2 > 0 && nota2 <= 10) {
            this.nota2 = nota2;
        } else {
            this.nota2 = 0;
        }

    }

    public String determinarEstado() {
        double promedio = calcularPromedio();
        if (promedio >= 7 && promedio <= 10) {
            return "Aprobado";
        } else if (promedio >= 5.5 && promedio < 7) {
            return "Supletorio";
        } else {
            return "Reprobado";
        }
    }

    public double calcularPromedio() {
        double promedio = (nota1 + nota2) / 2;
        return promedio;
    }

    public String mostrarDatos() {
        return "nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n" +
                "Carrera: " + carrera + "\n" +
                "Nota 1: " + nota1 + "\n" +
                "Nota 2: " + nota2 + "\n" +
                "Promedio: " + calcularPromedio() + "\n" +
                "Estado: " + determinarEstado() + "\n";
    }

    public void Alerta() {
        JOptionPane.showMessageDialog(null, mostrarDatos(), "Informacion del Estudiante",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
