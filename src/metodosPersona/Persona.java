package metodosPersona;

public class Persona {
    // Atributos
    String nombre;
    int edad;
    String dni;

    // Métodos
    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public Persona(String dni) {
        this.dni = dni;
    }

    public void correr(){
        System.out.println("Soy " + nombre + " tengo " + edad + " años y estoy corriendo una maraton");
    }


}
