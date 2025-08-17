package metodosAbstractas;

public abstract class AnimalCarnivoro extends Animal {

    @Override
    public void alimentarse(){
        System.out.println("El animal carnivoro se alimenta de carne");
    }
}
