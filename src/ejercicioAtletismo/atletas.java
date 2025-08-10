package ejercicioAtletismo;

public class atletas {
    private String codigoAtleta;
    private String nombreAtleta;
    private double tiempoCarrera;

    public atletas(String _codigoAtleta, String _nombreAtleta, double _tiempoCarrera){
        this.codigoAtleta = _codigoAtleta;
        this.nombreAtleta = _nombreAtleta;
        this.tiempoCarrera = _tiempoCarrera;
    }

    public double getTiempoCarrera() {
        return tiempoCarrera;
    }

    public String mostrarDatos(){
        return "Codigo Atleta: " + codigoAtleta + ", Nombre Atleta: " + nombreAtleta + ", Tiempo Carrera: " + String.format("%.2f", tiempoCarrera) + " segundos.";
    }
}
