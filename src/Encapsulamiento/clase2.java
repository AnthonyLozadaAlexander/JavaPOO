package Encapsulamiento;

public class clase2 {
    public static void main(String[] args) {
        clase1 objeto1 = new clase1();
        objeto1.edadPublica = 21;
        objeto1.setEdad(30); // Modificar la edad privada a través del método público

        System.out.println("Edad pública: " + objeto1.edadPublica);
        System.out.println("La edad es: " + objeto1.getEdad());

        objeto1.setNombre("Anthony");
        System.out.println("El Nombre es: " + objeto1.getNombre());

    }
}
