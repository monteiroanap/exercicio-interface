package atividade1;

public class Vaca extends Animal implements Herbivoro{

    void emitirSom(){
        System.out.println("Muuuuu");
    }

    @Override
    public void comerPasto() {
        System.out.println("come muita grama");
    }


}
