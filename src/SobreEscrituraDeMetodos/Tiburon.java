package SobreEscrituraDeMetodos;

public class Tiburon extends Animal {

    @Override // sobreescribir metodo de la clase Animal
    public void comer() {
        System.out.println("Estoy comiendo peces en el mar");
    }
}
