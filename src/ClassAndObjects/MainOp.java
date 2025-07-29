package ClassAndObjects;

import javax.swing.*;

public class MainOp {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));

        Operacion op = new Operacion(); // Crear una instancia de la clase Operacion
        op.sumar(num1, num2); // Llamar al método sumar
        op.restar(num1, num2); // Llamar al método restar
        op.multiplicar(num1, num2); // Llamar al método multiplicar
        op.dividir(num1, num2); // Llamar al método dividir

        op.mostrarResultados(); // Mostrar los resultados de las operaciones
    }
}
