package atividade1;

public class Gato extends Animal implements Carnivoro{

    void emitirSom(){
        System.out.println("Miaaaaau");
    }

    @Override
    public void comerCarne() {
        System.out.println("come mais carne que osso");
    }
}
