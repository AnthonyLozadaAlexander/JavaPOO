package ejercicioPolimorfismo.Poli;

public class vehiculoTurismo extends Vehiculo {
    private int nPuertas; // Número de puertas

    public vehiculoTurismo(String matricula, String marca, String modelo, int nPuertas) {
        super(matricula, marca, modelo);
        this.nPuertas = nPuertas;
    }

    public int getnPuertas() {
        return nPuertas;
    }

    @Override
    public String mostrarDatos() {
        return "Matricula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo + "\nNúmero de Puertas: " + nPuertas;
    }

}
