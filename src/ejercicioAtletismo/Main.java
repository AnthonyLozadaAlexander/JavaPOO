package ejercicioAtletismo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String codigoAtleta, nombreAtleta;
        double tiempoCarrera;
        int numsAtletas, indexMenorTiempo, indexMayorTiempo;

        System.out.println("¿Cuantos atletas participarán en la carrera?");
        numsAtletas = input.nextInt();
        atletas atleta[] = new atletas[numsAtletas];

        for (int i = 0; i < atleta.length ; i++) {
            input.nextLine(); // Limpiar el buffer
            System.out.println("Ingrese el codigo del atleta["+i+"]: ");
            codigoAtleta = input.nextLine();
            System.out.println("Ingrese el nombre del atleta["+i+"]: ");
            nombreAtleta = input.nextLine();
            System.out.println("Ingrese el tiempo de carrera del atleta["+i+"]: ");
            tiempoCarrera = input.nextDouble();

            atleta[i] = new atletas(codigoAtleta, nombreAtleta, tiempoCarrera);
        }


    }
}
