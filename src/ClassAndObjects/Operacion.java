package ClassAndObjects;

import javax.swing.*;

public class Operacion {
    int suma, resta, multiplicacion, division; // atributos de la clase

    // Metodos
    public void sumar(int num1, int num2){
        suma = num1 + num2;
    }

    public void restar(int num1, int num2 ){
        resta = num1 - num2;
    }

    public void multiplicar(int num1, int num2){
        multiplicacion = num1 * num2;
    }

    public void dividir(int num1, int num2) {
        if (num2 != 0) {
            division = num1 / num2;
        } else {
            JOptionPane.showMessageDialog(null, "Error: División por cero no permitida.");
            // Aquí podrías asignar un valor por defecto a la división, como:
            division = 0; // o lanzar una excepción
        }

    }

    public void mostrarResultados() {
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }
}
