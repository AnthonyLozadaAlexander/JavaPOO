package ejercicioPolimorfismo.Poli;

public class vehiculoFurgoneta extends Vehiculo {
    private int carga; // Capacidad de carga en kg

    public vehiculoFurgoneta(String matricula, String marca, String modelo, int carga) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    // Getter para la capacidad de carga
    public int getCarga() {
        return carga;
    }

    @Override
    public String mostrarDatos() {
        return "Matricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo + "\nCapacidad de Carga: " + carga + " kg";
    }
}
