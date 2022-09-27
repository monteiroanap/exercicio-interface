package atividade1;

public class Main {
    public static void main(String[] args) {
    Cachorro cachorro = new Cachorro();
    cachorro.emitirSom();
    Gato gato = new Gato();
    gato.emitirSom();
    Vaca vaca = new Vaca();
    vaca.emitirSom();


    cachorro.comerCarne();
    gato.comerCarne();
    vaca.comerPasto();
    }
}
