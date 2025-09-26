package EstudianteIGU;

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
        this.nota2 = nota2;
    }

    public double calcularPromedio() {
        return (nota1 + nota2) / 2;
    }

    public String mostrarDatos() {
        return "Nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n" +
                "Carrera: " + carrera + "\n" +
                "Nota 1: " + nota1 + "\n" +
                "Nota 2: " + nota2 + "\n" +
                "Promedio: " + calcularPromedio() + "\n";
    }
}
