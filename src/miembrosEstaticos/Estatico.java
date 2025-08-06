package miembrosEstaticos;

public class Estatico {
    private static String frase = "Primera frase";

    public static void main(String[] args) {
        Estatico obj1 = new Estatico();
        Estatico obj2 = new Estatico();

        obj2.frase = "Segunda frase";

        System.out.println(obj1.frase);
        System.out.println(obj2.frase);
    }
}
