package ClassAndObjects;

import java.util.Scanner;

public class Car {
    String color;
    String modelo;
    String marca;
    int km;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        Car car1 = new Car(); // creacion de objeto
        car1.color = "Rojo";
        car1.modelo = "Mustang";
        car1.marca = "Toyota";
        car1.km = 0;

        Car car2 = new Car();
        car2.color = "Azul";
        car2.modelo = "Civic";
        car2.marca = "Honda";
        car2.km = 10000;

        do {
            System.out.println("Atributos Del Coche1 y Coche2: ");
            System.out.println("Digite 1 para ver el color del coche");
            System.out.println("Digite 2 para ver el modelo del coche");
            System.out.println("Digite 3 para ver la marca del coche");
            System.out.println("Digite 4 para ver los kilometros del coche");
            System.out.println("Digite 5 para salir");
            option = input.nextInt();

            if (option == 1) {
                car1.color(); // Llamada al metodo color del objeto car1
                car2.color(); // Llamada al metodo color del objeto car2
            } else if (option == 2) {
                car1.modelo(); // Llamada al metodo modelo del objeto car1
                car2.modelo(); // Llamada al metodo modelo del objeto car2
            } else if (option == 3) {
                car1.marca(); // Llamada al metodo marca del objeto car1
                car2.marca(); // Llamada al metodo marca del objeto car2
            } else if (option == 4) {
                car1.km(); // Llamada al metodo km del objeto car1
                car2.km(); // Llamada al metodo km del objeto car2
            } else if (option == 5) {
                System.out.println("Saliendo...");
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
