package ejercicioPolimorfismo.Poli;

public class vehiculoDeportivo extends Vehiculo {
    private int cilindrada; // Cilindrada del vehículo deportivo

    // Constructor
    public vehiculoDeportivo(String matricula, String marca, String modelo, int cilindrada) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    // Getter para la cilindrada
    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public String mostrarDatos() {
        return "Matricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo + "\nCilindrada: " + cilindrada + " cc";
    }
}
