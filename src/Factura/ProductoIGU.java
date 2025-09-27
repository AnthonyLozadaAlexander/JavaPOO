/*
 * Created by JFormDesigner on Fri Sep 26 23:50:44 ECT 2025
 */

package Factura;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.*;

/**
 * @author USUARIO
 */
public class ProductoIGU extends JFrame {
    public static void main(String[] args) {
        ProductoIGU productoIGU = new ProductoIGU();
        productoIGU.setVisible(true);
    }

    public ProductoIGU() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        String[] columns = {"Producto", "Cantidad", "Descuento", "Precio Unitario", "Subtotal", "IVA", "Total"};
        DefaultTableModel model = new DefaultTableModel(columns, 0); // 0 es el número inicial de filas
        tablaProductos.setModel(model); // Establecer el modelo en la tabla
    }

    private void btnIngresar(ActionEvent e) {
        String producto = txtProducto.getText();
        int cantidad = Integer.parseInt(txtCantidad.getText());
        double descuento = Double.parseDouble(txtDescuento.getText());
        double precioUnitario = Double.parseDouble(txtPrecioUnitario.getText());

        ProductoClass Producto = new ProductoClass();

        Producto.setProducto(producto);
        Producto.setCantidad(cantidad);
        Producto.setDescuento(descuento);
        Producto.setPrecioUnitario(precioUnitario);

        Producto.calcularSubtotal();
        Producto.calcularPorcentajeDescuento();
        Producto.calcularIVA();
        Producto.calcularTotal();

        DefaultTableModel model = (DefaultTableModel) tablaProductos.getModel(); // Obtener el modelo de la tabla
        Object[] rowData = {
                // utilizamos los métodos get para obtener los valores
                Producto.getProducto(),
                Producto.getCantidad(),
                Producto.getDescuento(),
                Producto.getPrecioUnitario(),
                Producto.calcularSubtotal(),
                Producto.calcularIVA(),
                Producto.calcularTotal()
        };
        model.addRow(rowData); // Agregar la fila al modelo
        txtResultados.setText(Producto.mostrarResultados());
        Producto.mensajeInformativo(); // Mostrar el mensaje informativo
    }

    private void btnLimpiar(ActionEvent e) {
        txtProducto.setText("");
        txtCantidad.setText("");
        txtDescuento.setText("");
        txtPrecioUnitario.setText("");
        txtResultados.setText("");
        DefaultTableModel model = (DefaultTableModel) tablaProductos.getModel();
        model.setRowCount(0); // Limpiar todas las filas de la tabla
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Anthony Lozada Alexander
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        txtProducto = new JTextField();
        txtDescuento = new JTextField();
        txtPrecioUnitario = new JTextField();
        label5 = new JLabel();
        txtCantidad = new JTextField();
        btnIngresar = new JButton();
        btnLimpiar = new JButton();
        panel1 = new JPanel();
        tabla = new JScrollPane();
        tablaProductos = new JTable();
        scrollPane3 = new JScrollPane();
        txtResultados = new JTextPane();

        //======== this ========
        setBackground(Color.white);
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Factura De Productos");
        label1.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 20));

        //---- label2 ----
        label2.setText("Producto");
        label2.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 18));

        //---- label3 ----
        label3.setText("Precio Unitario");
        label3.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 18));

        //---- label4 ----
        label4.setText("Descuento");
        label4.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 18));

        //---- label5 ----
        label5.setText("Cantidad");
        label5.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 18));

        //---- btnIngresar ----
        btnIngresar.setText("Ingresar");
        btnIngresar.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 16));
        btnIngresar.addActionListener(e -> btnIngresar(e));

        //---- btnLimpiar ----
        btnLimpiar.setText("limpiar");
        btnLimpiar.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 16));
        btnLimpiar.addActionListener(e -> btnLimpiar(e));

        //======== panel1 ========
        {
            panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax
            . swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing
            . border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .
            Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt. Color. red
            ) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override
            public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .equals (e .getPropertyName (
            ) )) throw new RuntimeException( ); }} );

            //======== tabla ========
            {

                //---- tablaProductos ----
                tablaProductos.setModel(new DefaultTableModel(2, 0));
                tabla.setViewportView(tablaProductos);
            }

            //======== scrollPane3 ========
            {
                scrollPane3.setViewportView(txtResultados);
            }

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addComponent(tabla, GroupLayout.PREFERRED_SIZE, 613, GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, 613, GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(tabla, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(label1))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(txtProducto, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
                                .addGroup(contentPaneLayout.createParallelGroup()
                                    .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addGroup(contentPaneLayout.createParallelGroup()
                                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                            .addGroup(contentPaneLayout.createSequentialGroup()
                                                .addGap(7, 7, 7)
                                                .addComponent(label5, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(txtCantidad, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(label3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtDescuento, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtPrecioUnitario, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnIngresar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnLimpiar, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)))))
                    .addGap(18, 18, 18)
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(19, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(label1)
                    .addGap(29, 29, 29)
                    .addComponent(label2)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtProducto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(label5)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(txtCantidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(15, 15, 15)
                    .addComponent(label4)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtDescuento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(label3)
                    .addGap(18, 18, 18)
                    .addComponent(txtPrecioUnitario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btnIngresar)
                    .addGap(18, 18, 18)
                    .addComponent(btnLimpiar)
                    .addContainerGap(145, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Anthony Lozada Alexander
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JTextField txtProducto;
    private JTextField txtDescuento;
    private JTextField txtPrecioUnitario;
    private JLabel label5;
    private JTextField txtCantidad;
    private JButton btnIngresar;
    private JButton btnLimpiar;
    private JPanel panel1;
    private JScrollPane tabla;
    private JTable tablaProductos;
    private JScrollPane scrollPane3;
    private JTextPane txtResultados;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
