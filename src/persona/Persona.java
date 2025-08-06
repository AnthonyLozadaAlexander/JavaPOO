package persona;

public class Persona {

    String nombre;
    int edad;

    public Persona(String _nombre, int _edad){
        nombre = _nombre;
        edad = _edad;
    }

    public void mostrarDatos() {
        System.out.println("\nNombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

}
