/*
 * Created by JFormDesigner on Fri Sep 26 23:50:44 ECT 2025
 */

package Factura;

import javax.swing.*;
import javax.swing.GroupLayout;

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
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Anthony Lozada Alexander

        //======== this ========
        var contentPane = getContentPane();

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGap(0, 748, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGap(0, 581, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Anthony Lozada Alexander
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
