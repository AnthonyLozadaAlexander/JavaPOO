package Factura;

import javax.swing.*;

public class ProductoClass {
    private String producto;
    private double precioUnitario;
    private int cantidad;
    private double descuento;
    private final double IVA = 0.15;

    public String getProducto() {
        return producto;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getIVA() {
        return IVA;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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

    public double calcularTotal() {
        double total = (calcularSubtotal() - calcularPorcentajeDescuento()) + calcularIVA();
        return total;
    }

    public String mostrarResultados() {
        return "Producto: " + producto + "\n" +
                "PrecioUnitario: " + precioUnitario + "\n" +
                "Cantidad: " + cantidad + "\n" +
                "Descuento: " + descuento + "\n" +
                "IVA: " + IVA + "\n" +
                "Subtotal: " + calcularSubtotal() + "\n" +
                "PrecioTotal: " + calcularTotal() + "\n";
    }

    public void mensajeInformativo() {
        JOptionPane.showMessageDialog(null, mostrarResultados(), "Factura", JOptionPane.INFORMATION_MESSAGE);
    }
}
