package ClassAndObjects;

import java.util.Scanner;

public class Carro {
    String color;
    String modelo;
    String marca;
    int km;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        Carro carro1 = new Carro(); // creacion de Objeto
        carro1.color = "Rojo";
        carro1.modelo = "Mustang";
        carro1.marca = "Toyota";
        carro1.km = 0;

        Carro carro2 = new Carro();
        carro2.color = "Azul";
        carro2.modelo = "Civic";
        carro2.marca = "Honda";
        carro2.km = 10000;

        do {
            System.out.println("\n----------------------------------------------------");
            System.out.println("            Bienvenido Al Menu De Coches");
            System.out.println("----------------------------------------------------");
            System.out.println("Atributos Del Coche1 y Coche2: ");
            System.out.println("Digite 1 para ver el color del coche");
            System.out.println("Digite 2 para ver el modelo del coche");
            System.out.println("Digite 3 para ver la marca del coche");
            System.out.println("Digite 4 para ver los kilometros del coche");
            System.out.println("Digite 5 para salir");
            option = input.nextInt();

            if (option == 1) {
                carro1.color(); // Llamada al metodo color del Objeto carro1
                carro2.color(); // Llamada al metodo color del Objeto carro2
            } else if (option == 2) {
                carro1.modelo(); // Llamada al metodo modelo del Objeto carro1
                carro2.modelo(); // Llamada al metodo modelo del Objeto carro2
            } else if (option == 3) {
                carro1.marca(); // Llamada al metodo marca del Objeto carro1
                carro2.marca(); // Llamada al metodo marca del Objeto carro2
            } else if (option == 4) {
                carro1.km(); // Llamada al metodo km del Objeto carro1
                carro2.km(); // Llamada al metodo km del Objeto carro2
            } else if (option == 5) {
                System.out.println("\n----------------------------------------------------");
                System.out.println("            Gracias por usar el programa");
                System.out.println("                      Saliendo...");
                System.out.println("----------------------------------------------------");
            } else {
                System.out.println("Opcion no valida");
            }
        }while(option > 0 && option < 5);

        input.close();
    }

    public void color(){
        System.out.println("El color del coche es: " + color);
    }

    public void modelo(){
        System.out.println("El modelo del coche es: " + modelo);
    }

    public void marca(){
        System.out.println("La marca del coche es: " + marca);
    }

    public void km(){
        System.out.println("Los kilometros del coche son: " + km);
    }
}
