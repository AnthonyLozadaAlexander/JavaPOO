package ejercicioAtletismo;

import java.util.Scanner;

public class Main {

    public static int indiceMenorTiempo(atletas[] atleta){
        double tiempoMenor;
        int indexMenorTiempo = 0;

        tiempoMenor = atleta[0].getTiempoCarrera(); // se tomo el primer indice como el menor tiempo
        for (int i = 1; i < atleta.length ; i++) {
            if(atleta[i].getTiempoCarrera() < tiempoMenor){
                tiempoMenor = atleta[i].getTiempoCarrera();
                indexMenorTiempo = i;
            }
        }

        return indexMenorTiempo; // retorna el indice del atleta con el menor tiempo
    }

    public static int indiceMayorTiempo(atletas[] atleta){
        double tiempoMayor;
        int indexMayorTiempo = 0;

        tiempoMayor = atleta[0].getTiempoCarrera(); // se tomo el primer indice como el mayor tiempo
        for (int i = 1; i < atleta.length ; i++) {
            if(atleta[i].getTiempoCarrera() > tiempoMayor){
                tiempoMayor = atleta[i].getTiempoCarrera();
                indexMayorTiempo = i;
            }
        }

        return indexMayorTiempo; // retorna el indice del atleta con el mayor tiempo
    }

// Clase principal para manejar la entrada de datos y la lógica del programa
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

            atleta[i] = new atletas(codigoAtleta, nombreAtleta, tiempoCarrera); // Crear un nuevo Objeto atleta del
            // tipo atletas con los argumentos ingresados por el usuario
        }

        indexMenorTiempo = indiceMenorTiempo(atleta);
        indexMayorTiempo = indiceMayorTiempo(atleta);

        System.out.println("El atleta con el menor tiempo es: " + atleta[indexMenorTiempo].mostrarDatos());
        System.out.println("El atleta con el mayor tiempo es: " + atleta[indexMayorTiempo].mostrarDatos());

    }
}
