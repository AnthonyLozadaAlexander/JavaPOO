package Constantes;

public class Persona {
    private final String nombre;
    private int edad;

    // Constructor para inicializar los atributos
    public Persona(String nombre, int edad) {
        this.nombre = nombre; // nombre es constante
        this.edad = edad;
    }

    public void mostrarDatos(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

}
