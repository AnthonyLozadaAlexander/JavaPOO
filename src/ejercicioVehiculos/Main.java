package ejercicioVehiculos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String marca, modelo;
        double precio;
        int numsVehiculos;

        System.out.println("¿Cuántos vehículos desea ingresar?");
        System.out.print("-> ");
        numsVehiculos = input.nextInt();

        // Creacion de objeto array de objetos vehiculo
        vehiculo coches[] = new vehiculo[numsVehiculos];

        for (int i = 0; i < coches.length; i++) {
            System.out.println("Digite las caracteristicas del vehiculo[" + (i) + "]:");
            System.out.print("Introduzca Marca: ");
            marca = input.next();
            System.out.print("Introduzca Modelo: ");
            modelo = input.next();
            System.out.print("Introduzca Precio: ");
            precio = input.nextDouble();


        }

    }
}
