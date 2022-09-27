package atividade1;

public class Cachorro extends Animal implements Carnivoro{
    @Override
    void emitirSom(){
        System.out.println("AuAu");
    }

    @Override
    public void comerCarne() {
        System.out.println("come muita carne e osso");
    }
}
