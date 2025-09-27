package Factura;

public class ProductoClass {
    private String producto;
    private double precioUnitario;
    private int cantidad;
    private double precioTotal;
    private double descuento;
    private final double IVA = 0.15;

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double calcularSubtotal() {
        return precioUnitario * cantidad;
    }

    public double calcularPorcentajeDescuento() {
        double descuento = calcularSubtotal() * this.descuento;
        return descuento;
    }

    public double calcularIVA() {
        double iva = (calcularSubtotal() - calcularPorcentajeDescuento()) * IVA;
        return iva;
    }
}
