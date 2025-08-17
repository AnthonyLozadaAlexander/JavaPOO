package metodosAbstractas;

public class Main {
    public static void main(String[] args) {
        Planta planta = new Planta();
        AnimalCarnivoro animalCarnivoro = new AnimalCarnivoro();

        animalCarnivoro.alimentarse();
        planta.alimentarse();
    }
}
