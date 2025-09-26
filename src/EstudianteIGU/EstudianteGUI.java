/*
 * Created by JFormDesigner on Thu Sep 25 18:40:09 ECT 2025
 */

package EstudianteIGU;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
//import org.jdesktop.swingx.*;

/**
 * @author USUARIO
 */
public class EstudianteGUI extends JFrame {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new EstudianteGUI();
            frame.setVisible(true);
        });
    }

    public EstudianteGUI() {
        initComponents();
    }

    private void btnIngresar(ActionEvent e) {
        String nombre = txtNombre.getText();
        int edad = Integer.parseInt(txtEdad.getText());
        String carrera = txtCarrera.getText();
        double nota1 = Double.parseDouble(txtNota1.getText());
        double nota2 = Double.parseDouble(txtNota2.getText());

        Estudiante E1 = new Estudiante();

        E1.setNombre(nombre);
        E1.setEdad(edad);
        E1.setCarrera(carrera);
        E1.setNota1(nota1);
        E1.setNota2(nota2);

        txtResultados.append(E1.mostrarDatos() + "\n");

        E1.Alerta();
    }

    public void limpiarTxT() {

    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Anthony Lozada Alexander
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        txtNombre = new JTextField();
        txtEdad = new JTextField();
        txtCarrera = new JTextField();
        btnIngresar = new JButton();
        label5 = new JLabel();
        txtNota1 = new JTextField();
        txtNota2 = new JTextField();
        label6 = new JLabel();
        scrollPane1 = new JScrollPane();
        txtResultados = new JTextArea();

        //======== this ========
        setBackground(Color.white);
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Registro De Estudiantes");
        label1.setForeground(Color.black);
        label1.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 22));

        //---- label2 ----
        label2.setText("Nombre:");
        label2.setForeground(Color.black);

        //---- label3 ----
        label3.setText("Edad:");
        label3.setForeground(Color.black);

        //---- label4 ----
        label4.setText("Carrera:");
        label4.setForeground(Color.black);

        //---- txtNombre ----
        txtNombre.setBackground(Color.white);
        txtNombre.setForeground(Color.black);

        //---- txtEdad ----
        txtEdad.setBackground(Color.white);
        txtEdad.setForeground(Color.black);

        //---- txtCarrera ----
        txtCarrera.setBackground(Color.white);
        txtCarrera.setForeground(Color.black);

        //---- btnIngresar ----
        btnIngresar.setText("Ingresar");
        btnIngresar.setBackground(Color.white);
        btnIngresar.setFont(new Font("CaskaydiaMono NF SemiBold", Font.PLAIN, 15));
        btnIngresar.addActionListener(e -> btnIngresar(e));

        //---- label5 ----
        label5.setText("Nota 2:");
        label5.setForeground(Color.black);

        //---- txtNota1 ----
        txtNota1.setBackground(Color.white);
        txtNota1.setForeground(Color.black);

        //---- txtNota2 ----
        txtNota2.setBackground(Color.white);
        txtNota2.setForeground(Color.black);

        //---- label6 ----
        label6.setText("Nota 1:");
        label6.setForeground(Color.black);

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(txtResultados);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(95, 95, 95)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label2)
                                    .addGap(5, 5, 5)
                                    .addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label3)
                                    .addGap(21, 21, 21)
                                    .addComponent(txtEdad, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label4)
                                    .addGap(9, 9, 9)
                                    .addComponent(txtCarrera, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(label6)
                                    .addGap(9, 9, 9)
                                    .addComponent(txtNota2, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(label5)
                                    .addGap(12, 12, 12)
                                    .addComponent(txtNota1, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(65, 65, 65)
                                    .addComponent(btnIngresar)))
                            .addGap(54, 54, 54)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 362, GroupLayout.PREFERRED_SIZE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(251, 251, 251)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(113, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(label1)
                    .addGap(58, 58, 58)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(label2))
                                .addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(label3))
                                .addComponent(txtEdad, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                            .addGap(12, 12, 12)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(label4))
                                .addComponent(txtCarrera, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(label6))
                                .addComponent(txtNota2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(label5))
                                .addComponent(txtNota1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                            .addGap(17, 17, 17)
                            .addComponent(btnIngresar))
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(135, Short.MAX_VALUE))
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
    private JTextField txtNombre;
    private JTextField txtEdad;
    private JTextField txtCarrera;
    private JButton btnIngresar;
    private JLabel label5;
    private JTextField txtNota1;
    private JTextField txtNota2;
    private JLabel label6;
    private JScrollPane scrollPane1;
    private JTextArea txtResultados;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
