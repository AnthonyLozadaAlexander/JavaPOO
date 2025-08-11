package ejercicioHerencia;

public class Estudiante extends Persona {
    //Atributos extras
    private int codigoEstudiante;
    private double notaFinal;

    //Constructor
    public Estudiante(String _nombre, String _apellido, int _edad, int _codigoEstudiante, double _notaFinal){
        super(_nombre, _apellido, _edad); // atributos de la clase padre
        this.codigoEstudiante = _codigoEstudiante;
        this.notaFinal = _notaFinal;
    }

    public void mostrarDatos(){

    }

}
