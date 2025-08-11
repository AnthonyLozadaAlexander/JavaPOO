package ejercicioHerencia;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String _nombre, String _apellido, int _edad){
        this.nombre = _nombre;
        this.apellido = _apellido;
        this.edad = _edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
}
