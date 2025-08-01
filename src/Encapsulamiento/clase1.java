package Encapsulamiento;

public class clase1 {
    public int edadPublica; // Acceso público
    private int edadPrivada; // Acceso privado
    private String nombre;

    // Metodo Setter: Establecemos la edad
    public void setEdad(int edad){
        this.edadPrivada = edad; // Modificar la edad privada
    }

    // Metodo Getter: Mostramos la edad
    public int getEdad(){
        return edadPrivada;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }


}
