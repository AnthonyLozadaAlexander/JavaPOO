package ejercicioPolimorfismo.Poli;

public class vehiculoTurismo extends Vehiculo {
    private int nPuertas;

    public vehiculoTurismo(String matricula, String marca, String modelo, int nPuertas) {
        super(matricula, marca, modelo);
        this.nPuertas = nPuertas;
    }


}
