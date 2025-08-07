package ejercicioVehiculos;

public class vehiculo {
    private String marca;
    private String modelo;
    private double precio;

    public vehiculo(double precio, String modelo, String marca) {
        this.precio = precio;
        this.modelo = modelo;
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public String mostrarDatos(){
        return "Marca: " + marca + " // Modelo: " + modelo + " // Precio: $" + String.format("%.2f", precio);
    }
}
