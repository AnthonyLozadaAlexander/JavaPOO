package ejercicioObjetoMovimiento;

import javax.swing.*;

public class Objeto {

    private int x;
    private int y;

    // Constructor para inicializar las coordenadas del Objeto
    public Objeto(int _x, int _y) {
        this.x = _x;
        this.y = _y;
    }

    // Método para mover el Objeto a nuevas coordenadas
    public void moverArriba() {
        if (y > 0) {
            y--;
            System.out.println("Objeto movido hacia arriba a la posición: (" + x + ", " + y + ")");
            JOptionPane.showMessageDialog(null, "Objeto movido hacia arriba a la posición: (" + x + ", " + y + ")");

        } else {
            System.out.println("El Objeto no se puede mover más arriba.");
            JOptionPane.showMessageDialog(null, "El Objeto no se puede mover más arriba.");

        }
    }

    public void moverAbajo() {
        if (y < 9) {
            y++;
            System.out.println("Objeto movido hacia abajo a la posición: (" + x + ", " + y + ")");
            JOptionPane.showMessageDialog(null, "Objeto movido hacia abajo a la posición: (" + x + ", " + y + ")");

        } else {
            System.out.println("El Objeto no se puede mover más abajo.");
            JOptionPane.showMessageDialog(null, "El Objeto no se puede mover más abajo.");

        }
    }

    public void moverIzquierda() {
        if (x > 0) {
            x--;
            System.out.println("Objeto movido hacia la izquierda a la posición: (" + x + ", " + y + ")");
            JOptionPane.showMessageDialog(null,
                    "Objeto movido hacia la izquierda a la posición: (" + x + ", " + y + ")");

        } else {
            System.out.println("El Objeto no se puede mover más a la izquierda.");
            JOptionPane.showMessageDialog(null, "El Objeto no se puede mover más a la izquierda.");

        }
    }

    public void moverDerecha() {
        if (x < 9) {
            x++;
            System.out.println("Objeto movido hacia la derecha a la posición: (" + x + ", " + y + ")");
            JOptionPane.showMessageDialog(null, "Objeto movido hacia la derecha a la posición: (" + x + ", " + y + ")");

        } else {
            System.out.println("El Objeto no se puede mover más a la derecha.");
            JOptionPane.showMessageDialog(null, "El Objeto no se puede mover más a la derecha.");

        }
    }

    public void mostrarPosicion() {
        System.out.println("Posición actual del Objeto: (" + x + ", " + y + ")");
        JOptionPane.showMessageDialog(null, "Posición actual del Objeto: (" + x + ", " + y + ")");

    }
}
