package persona;

public class Persona {

    // Atributos
    String nombre;
    String apellido;
    int edad;

    public Persona(String _nombre, String _apellido, int _edad) {
        nombre = _nombre;
        edad = _edad;
        apellido = _apellido;
    }

    public void mostrarDatos() {
        System.out.println("\nNombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
    }

}
