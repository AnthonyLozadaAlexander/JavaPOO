package ejercicioVehiculos;

import java.util.Scanner;

public class Main {

    public static int indiceCocheMasBarato(vehiculo coches[]){
        double precio;
        int indice = 0;

        precio = coches[0].getPrecio(); // Inicializamos el precio con el del primer coche
        for (int i = 1; i < coches.length; i++) {
        // Comparamos el precio del coche actual con el del coche más barato encontrado hasta ahora
            if(coches[i].getPrecio() < precio){
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String marca, modelo;
        double precio;
        int numsVehiculos, indiceCocheMasBarato;

        System.out.println("¿Cuántos vehículos desea ingresar?");
        System.out.print("-> ");
        numsVehiculos = input.nextInt();

        // Creacion de Objeto array de objetos vehiculo
        vehiculo coches[] = new vehiculo[numsVehiculos];

        for (int i = 0; i < coches.length; i++) {
            input.nextLine(); // Limpiar el buffer del scanner

            // Pedimos las caracteristicas del vehiculo
            System.out.println("\nIngrese las caracteristicas del vehiculo[" + (i) + "]:");
            System.out.print("Introduzca Marca: ");
            marca = input.nextLine();
            System.out.print("Introduzca Modelo: ");
            modelo = input.nextLine();
            System.out.print("Introduzca Precio: ");
            precio = input.nextDouble();

            coches[i] = new vehiculo(precio, modelo, marca); // creacion del Objeto vehiculo junto con sus
            // caracteristicas/atributos
        }

        indiceCocheMasBarato = indiceCocheMasBarato(coches);
        System.out.println("\nEl Coche mas barato es: \n"  +
                coches[indiceCocheMasBarato].mostrarDatos());

    }
}
