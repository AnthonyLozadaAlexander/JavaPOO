package ClassAndObjects;

import java.util.Scanner;

public class Car {
    String color;
    String modelo;
    String marca;
    int km;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Car car1 = new Car(); // creacion de objeto
        int option;
        car1.color = "Rojo";
        car1.modelo = "Mustang";
        car1.marca = "Toyota";
        car1.km = 0;

        do {
            System.out.println("Atributos Del Coche: ");
            System.out.println("Digite 1 para ver el color del coche");
            System.out.println("Digite 2 para ver el modelo del coche");
            System.out.println("Digite 3 para ver la marca del coche");
            System.out.println("Digite 4 para ver los kilometros del coche");
            System.out.println("Digite 5 para salir");
            option = input.nextInt();

            if (option == 1) {
                car1.color();
            } else if (option == 2) {
                System.out.println("El modelo del coche es: " + car1.modelo);
            } else if (option == 3) {
                System.out.println("La marca del coche es: " + car1.marca);
            } else if (option == 4) {
                System.out.println("Los kilometros del coche son: " + car1.km);
            } else if (option == 5) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opcion no valida");
            }
        }while(option > 0 && option < 5);

    }

    public void color(){
        System.out.println("El color del coche es: " + color);
    }
}
